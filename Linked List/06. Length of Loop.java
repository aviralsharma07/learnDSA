// Problem Link: https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455

/*
---------------- BRUTE FORCE APPROACH ---------------- 
*/
public static int lengthOfLoop(Node head) {
        if (head == null || head.next == null) return 0;
        Node temp = head;
        HashMap<Node,Integer> nodeMap = new HashMap<>();
        int pos = 0, cnt = 1;
        while (temp != null){
            if (nodeMap.containsKey(temp)) {
                pos = nodeMap.get(temp);
                return cnt - pos;
            }
            nodeMap.put(temp, cnt++);
            temp = temp.next;
        }
        return 0;
    }


// ---------------- FLOYD'S CYCLE DETECTION ALGORITHM ----------------

public static int lengthOfCycle(Node head) {
        if (head == null || head.next == null) {
            return 0; // No cycle if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        
        // Move the pointers until either the fast pointer reaches the end or they meet
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps

            if (slow == fast) {
                isCycle = true; // Cycle detected
                break;
            }
        }

        if (!isCycle) {
            return 0; // No cycle found, so the length is 0
        }

        // Move one of the pointers further until it reaches the meeting point again
        int length = 1;
        fast = fast.next;
        while (fast != slow) {
            fast = fast.next;
            length++;
        }

        return length;
    }
