package Week1;

public class LinkedListIntersection {
    public class Node{
        int value;
        Node next;
        Node(int val){
            value = val;
            next = null;
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        // find length of both linked list
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        int diff = Math.abs(lengthA - lengthB);
        if(lengthA >= lengthB){
            headA = moveNode(headA, diff);
        } else{
            headB = moveNode(headB, diff);
        }
        while(headA != null && headB != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public Node moveNode(Node node, int diff){
        while(diff > 0){
            node = node.next;
            diff--;
        }
        return node;
    }
    public int getLength(Node node){
        int nodeLength = 0;
        while(node != null){
            nodeLength++;
            node = node.next;
        }
        return nodeLength;
    }
}
