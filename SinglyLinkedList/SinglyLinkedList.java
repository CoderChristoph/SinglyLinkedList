
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public Node remove() {
        Node previous = this.head;
        Node runner = this.head;
        if(this.head == null) {
            return null;
        } else {
            while(runner != null) {
                runner = runner.next;
            }
            while(previous.next != runner) {
                previous = previous.next;
            }
            previous.next = null;
        }

        return runner;
    }

    public void printValues() {
        if(this.head == null) {
            System.out.println("the list is empty");;
        } else {
            Node runner = this.head;
            while(runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

    public Node findInt(int val) {
        if(this.head == null) {
            return null;
        } else {
            Node runner = this.head;
            while(runner != null) {
                if (runner.value == val) {
                    return runner;
                }
                runner = runner.next;
            }
        }
        return null;
    }

    public Node removeAt(int indx) {
        int count = 0;
        Node previous = this.head;
        Node runner = this.head;
        if(this.head == null) {
            return null;
        } else {
            while(runner != null) {
                if (count == indx) {
                    break;
                }
                runner = runner.next;
                count++;
            }
            while(previous.next != runner) {
                previous = previous.next;
            }
            previous.next = runner.next;
        }
        return runner;
    }
}