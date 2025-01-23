package linkedList;

public class MyLinkedList {
    private Node head;

    /*
     * creating linked list based on passed values
     *
     * */
    public static Node createSinglyLinkedList(int... value) {
        Node head = new Node(value[0]);
        if (value.length != 1) {
            Node start = head;
            for (int i = 1; i < value.length; i++) {
                Node node = new Node(value[i]);
                start.setNext(node);
                start = node;
            }
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node start = head;
        while (start != null) {
            if (start.getNext() != null) {
                System.out.print(start.getValue() + "->");
            } else {
                System.out.print(start.getValue());
            }

            start = start.getNext();
        }
        System.out.println();
    }

    public static int lengthOfList(Node head) {
        Node start = head;
        int length = 0;
        while (start != null) {
            length++;
            start = start.getNext();
        }
        return length;
    }

    public static Node insertNode(Node headNode, int value, int pos) {
        Node start = headNode;
        //position is greater than length
        int length = lengthOfList(headNode);
        if (pos > length) {
            throw new IndexOutOfBoundsException("The position to be inserted is greater than the length of the list");
        }
        //insert at head
        if (pos == 0) {
            Node node = new Node(value);
            node.setNext(headNode);
            headNode = node;
            return headNode;
        }
        //insert at middle
        else {
            int count = 0;
            while (start != null) {
                if (count + 1 == pos)
                    break;
                count++;
                start = start.getNext();
            }
            Node node = new Node(value);
            node.setNext(start.getNext());
            start.setNext(node);
            return headNode;
        }


    }

    /*
    * logic
    * the main purpose is to reverse the links between node such
    * 1->2->3->4->null should become null<-1<-2<-3<-4
    * there should be 3 pointer current = head and previous =null and next =null
    * we have to make current  reach null and in the loop
    * next will become current.getNext()
    * have to set current's next as previous
    * then make previous =current and current=next
    * after the loop ends the previous will point to the new head and the links will be reversed
    * 
    * */
    public static Node reverseLinkedList(Node headNode) {
        Node current = headNode;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    //find nth element from last
    /*
     *  logic
     * use 2 pointers main pointer and  ref pointer
     * start from head
     * move the  main pointer till count<n
     * now move the  main pointer and ref pointer together until ref pointer reaches null
     * when ref pointer will reach null main pointer  will point to nth element from end
     *
     * */
    public static void findNthFromLast(Node headNode, int n) {
        Node mainPtr = headNode;
        Node refPtr = headNode;
        int count = 0;
        while (count < n) {
            count++;
            refPtr = refPtr.getNext();
        }
        while (refPtr != null) {
            mainPtr = mainPtr.getNext();
            refPtr = refPtr.getNext();
        }
        System.out.println("Nth element from end is " + mainPtr.getValue());
    }

    public static void main(String[] args) {
        Node headNode = createSinglyLinkedList(1, 2, 3, 4, 5, 6);
        printLinkedList(headNode);
        System.out.println(lengthOfList(headNode));
        insertNode(headNode, 77, 4);
        printLinkedList(headNode);
        System.out.println("Find nth element from last");
        findNthFromLast(headNode, 2);
        System.out.println("Reversing linked list ");
        headNode = reverseLinkedList(headNode);
        printLinkedList(headNode);
    }


}

