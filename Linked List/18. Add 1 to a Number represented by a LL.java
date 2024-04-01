// Problem Link: https://www.naukri.com/code360/problems/add-one-to-a-number-represented-as-linked-list_920557

/*
    BRUTE FORCE SOLUTION
    1. Reverse the LL
    2. For Each Node:
          if (data == 9 && nextNode == null) data = 1 AND add a new Node with value 0 to after head;
          else if(data == 9) data = 1;
          else data+=1;
    3. Reverse the LL again
    4. return the head. 
*/
public class Solution {
	public static Node addOne(Node head) {
		head = reverse(head);
		Node current = head;
		int carry = 1;
		while (current != null){
			if (current.data == 9 && current.next == null){
				current.data = 1;
				Node temp = new Node(0);
				temp.next = head;
				head = temp;
			}else if(current.data == 9){
				current.data = 0;
			}else{
				current.data += 1;
				break;
			}
			current = current.next;
		}

		head = reverse(head);
		return head; 
		
	}

	public static Node reverse(Node head){
		Node current = head;
		Node prev = null;
		while (current != null){
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
}

// There is a Recursive Backtracking solution too. 
