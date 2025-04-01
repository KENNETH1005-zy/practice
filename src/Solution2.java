class Solution2 {
    public static LinkedListNode <Integer> reverse (LinkedListNode <Integer> head) {
        LinkedListNode <Integer> current = head;
        LinkedListNode <Integer> previous = null;
        LinkedListNode<Integer> nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
        return head;
    }
    public static void main(String[] args) {
        Integer[][] input = {
                {10, 20, 30, 40, 50},
                {-1, -2, -3, -4, -5, -6},
                {3, 2, 1},
                {12},
                {1, 2},
        };

        for (int i = 0; i < input.length; i++) {
            LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
            inputLinkedList.createLinkedList(input[i]);
            System.out.print((i + 1) + ".\tInput linked list: ");
            PrintList<Integer> printLinkedList = new PrintList<Integer>();
            printLinkedList.printListWithForwardArrow(inputLinkedList.head);
            System.out.print("\n\tReverse linked list: ");
            printLinkedList.printListWithForwardArrow(reverse(inputLinkedList.head));
            System.out.println();
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}