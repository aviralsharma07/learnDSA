// Problem Link: https://leetcode.com/problems/palindrome-linked-list/


/*
------------------ BRUTE FORCE APPROACH ------------------
  1. Store elements of Linked List in Arraylist or Array
  2. Check if List is Palindrome. 
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer> values = new ArrayList<>();
       ListNode temp = head;
       while (temp != null){
        values.add(temp.val);
        temp = temp.next;
       } 
       return isPailindrome(values);
    }

    public static boolean isPailindrome(ArrayList values){
        if (values == null || values.size() <= 1) return true;
        int left = 0;
        int right =  values.size() - 1;
        while (left <= right){
            if(!values.get(left).equals(values.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// OPTIMIZED SOLUTION: REVERSE THE SECOND HALF OF THE LINKED LIST AND COMPARE IT WITH THE FIRST HALF. 
