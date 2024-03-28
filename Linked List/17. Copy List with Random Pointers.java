// Problem Link: https://leetcode.com/problems/copy-list-with-random-pointer/description/

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        HashMap<Node,Node> map = new HashMap();
        while (current != null){
            Node newNode = new Node(current.val);
            map.put(current,newNode);
            current = current.next;
        }

        current = head;
        while (current != null){
            Node copyNode = map.get(current);
            copyNode.next = map.get(current.next);
            copyNode.random = map.get(current.random);

            current = current.next;
        }

        return map.get(head);
    }
}
