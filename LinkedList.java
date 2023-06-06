import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class list {
    private Node head;

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfterElement(int element, int data) {
        Node newNode = new Node(data);

        Node current = head;
        while (current != null) {
            if (current.data == element) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        System.out.println("Element " + element + " not found in the list.");
    }

    public void insertByPosition(int position, int data) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBegin(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteInBetween(int data) {
        if (head == null) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Element " + data + " not found in the list.");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ele,pos,choice;
        list ll = new list();
        do{
            System.out.println(" 1.insertAtBegin"+"\n 2.insertAtEnd"+"\n 3.insertAfterElement"+ "\n 4.insertByPosition"+"\n 5.deleteAtBegin"+"\n 6.deleteAtEnd"+"\n 7.deleteInBetween"+"\n 8.Display" +"\n 9.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("\n Enter element to insert at begin");
                    ele=sc.nextInt();
                    ll.insertAtBegin(ele);
                    break;
                case 2:
                    System.out.println("\n Enter element to insert at end");
                    ele=sc.nextInt();
                    ll.insertAtEnd(ele);
                    break;
                case 3:
                    System.out.println("\n Enter element number to check");
                    pos=sc.nextInt();
                    System.out.println("\n Enter element to insert");
                    ele=sc.nextInt();
                    ll.insertAfterElement(pos,ele);
                    break;
                case 4:
                    System.out.println("\n Enter element position");
                    pos=sc.nextInt();
                    System.out.println("\n Enter element to insert");
                    ele=sc.nextInt();
                    ll.insertByPosition(pos,ele);
                    break;
                case 5:
                    ll.deleteAtBegin();
                    System.out.println("\n Elemet deleted at begin : ");
                    break;
                case 6:
                    ll.deleteAtEnd();
                    System.out.println("\n Element deleted at end : ");
                    break;
                case 7:
                    System.out.println("\n Element to delete: ");
                    ele = sc.nextInt();
                    ll.deleteInBetween(ele);
                    System.out.println("\n Element deleted : ");
                    break;
                case 8:
                    System.out.println("LinkedList elements are: ");
                    ll.display();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n Invalid choice");
                    break;

            }
        }
        while(true);
    }
}
