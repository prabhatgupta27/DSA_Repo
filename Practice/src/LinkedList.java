public class LinkedList{
        static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head =null;
    Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    private void printMe(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data +"-->");
           temp = temp.next;
       }
        System.out.println("Null");
    }

    private void findMiddleNode(){
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        System.out.println(slowPointer.data);
    }

    private void findCycle(){
        Node slowPointer = head;
        Node fastPointer = head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if(slowPointer == fastPointer){
                System.out.println("we have a loop here at node " +slowPointer.data);
                break;
            }
        }

    }

    public static void main(String[] args) {

       LinkedList ll = new LinkedList();
       ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
       ll.addNode(4);
        ll.addNode(5);
        ll.addNode(6);

     //   ll.head.next.next.next = ll.head.next;
      //  ll.findCycle();
     ll.printMe();
      ll.findMiddleNode();
    }

}
