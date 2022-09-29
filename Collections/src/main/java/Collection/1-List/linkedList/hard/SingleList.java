package Collection.List.linkedList.hard;

public class SingleList {

    Node head;
    int size;


    // 1- add Node...
    public void addNode(Object data) {
        Node newNode = new Node(data);
        head = newNode;
        size++;
    }




    // 2- Add To First
    public void addToFirst(Object data) {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        Node pointer = head;
        while(pointer != null) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
            break;
        }
    }



    // Add To End
    public void addToEnd(Object data) {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        Node pointer = head;
        while(pointer != null) {
            if(pointer.next == null) {
                Node newNode = new Node(data);
                pointer.next = newNode;
                size++;
                break;
            }
            pointer = pointer.next;
        }
    }






    // isEmpty
    boolean isEmpty() {
        return head == null;
    }


    // display list
    public void display() {
        if(isEmpty()) {
            System.out.println("List is Empty");
        }else {
            Node currentNode = head;
            while(currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println(currentNode);
            System.out.println("Size : "+size);
            System.out.println("Head: "+head.data);

        }
    }



}
