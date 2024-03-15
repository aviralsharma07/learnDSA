// Problem Link: https://leetcode.com/problems/middle-of-the-linked-list/description/

/*
 ----------------------------- BRUTE FORCE APPROACH -----------------------------
 1. Iterate through the Linked List and find the Number of Elements.
 2. Find the middle Element = Number Of Elements / 2
 3. Again Iterate through Linked List until count of Middle Element and on reaching Middle Element,
    Store that Middle node as Answer.
 4. Return Answer Node after exiting the Loop
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        int numOfElem = numberOfElements(head);
        int middleElement = 0;
        middleElement = (numOfElem/2)+1;
        ListNode temp = head;
        ListNode answer = head;
        while (middleElement != 0){
            answer = temp;
            temp = temp.next;
            middleElement--;
        }
        return answer;
    }
    public static int numberOfElements(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count+1;
    }
}


/*
----------------------------- OPTMIZED SOLUTION -----------------------------
 1. Instead of Running two seperate loops for finding Element count and them reaching mid element:
 2. Run a Single loop to count and simultaneously store Linked List elements in ArrayList
 3. Find mid element with count of number of elements and just return element at mid index of arrayList. 
*/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ArrayList<ListNode> nodeList = new ArrayList<>();
        int count = 0;
        while (temp != null){
            nodeList.add(temp);
            temp = temp.next;
            count++;
        }
        System.out.println(count);
        return nodeList.get((count)/2);
    }
}
