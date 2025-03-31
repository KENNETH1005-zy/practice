class Solution {
    public static boolean deleteByValue(LinkedListNode<Integer> head, int value) {
        boolean detected = false;
        LinkedListNode <Integer> current = head;
        LinkedListNode <Integer> previous = null;
        if (value == current.data) {
            head = head.next;
            detected = true;
            return detected;
        }
        while (current != null) {
            if (current.data == value) {
                previous.next = current.next;
                current.next = null;
                detected = true;
                break;
            }
            previous = current;
            current = current.next;
        }
        return detected;
    }
    public static void main(String[] args) {

        Integer[][] input = {
                {10, 20, 30, 40, 50},
                {-1, -2, -3, -4, -5, -6},
                {3, 2, 1},
                {12},
                {1, 2},
        };

        int[] values = {30, -8, 3, 12, 1};

        for (int i = 0; i < input.length; i++) {
            LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
            inputLinkedList.createLinkedList(input[i]);
            System.out.print((i + 1) + ".\tInput linked list: ");
            PrintList<Integer> printLinkedList = new PrintList<Integer>();
            printLinkedList.printListWithForwardArrow(inputLinkedList.head);
            System.out.println("\n\tValue to be deleted: "+ values[i]);
            System.out.println("\n\tResult: "+ deleteByValue(inputLinkedList.head, values[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}