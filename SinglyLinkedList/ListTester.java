public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(15);
        sll.add(20);
        sll.removeAt(3);
        sll.printValues();
    }
}