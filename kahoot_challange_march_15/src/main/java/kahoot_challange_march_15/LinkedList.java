package kahoot_challange_march_15;

public class LinkedList {
     
    private Node head; 
     
    public void populateList(int num) {
         
        if(head == null) {
            head = new Node(num);
            return;
        }
         
        Node fig = head;
        while(fig.getNext() != null) {
            fig = fig.getNext();
        }
        fig.setNext(new Node(num));
    }
  
    public static Node intersect(LinkedList list1, LinkedList list2) {

        int length1 = 0;
        Node no1 = list1.getHead();
        while(no1.getNext() != null) {
            length1++;
            no1 = no1.getNext();      
        }
  
        int length2 = 0;
        Node  no2 = list2.getHead();
        while( no2.getNext() != null) {
            length2++;
             no2 =  no2.getNext();      
        }
         
        if(no1 !=  no2) {
            return null;
        }
 
        int diff = 0;
        if(length1 > length2) {
            no1 = list1.getHead();
             no2 = list2.getHead();
            diff = length1 - length2;
        } else {
            no1 = list2.getHead();
             no2 = list1.getHead();
            diff = length2 - length1;
        }
        while(diff > 0) {
            no1 = no1.getNext();
            diff--;
        }
        while(no1 !=  no2) {
            no1 = no1.getNext();
             no2 =  no2.getNext();
        }
        return no1;
    }
 
    public Node getHead() {
        return head;
    }
     
    public void setHead(Node head) {
        this.head = head;
    }

    public static void main(String[] args) {
         
        LinkedList list1 = new LinkedList();
        
            list1.populateList(3);
            list1.populateList(7);
            list1.populateList(8);
            list1.populateList(10);
         
        LinkedList list2 = new LinkedList();
       
            list2.populateList(99);
            list2.populateList(1);
            list2.populateList(8);
            list2.populateList(10);
         
        Node no1 = list1.getHead();
        int i = 1;
       int n = 4;
        while(i < n) {
            no1 = no1.getNext();
            i++;
        }
         
        Node  no2 = list2.getHead();
        while( no2.getNext() != null) {
             no2 =  no2.getNext();
        }
         no2.setNext(no1);
         
        Node intersection = LinkedList.intersect(list1, list2);
        if(intersection != null) {
            System.out.println(" Node intersected at " + intersection.getData());
        } else {
            System.out.println("there is no intersect!");
        }
    }

    class Node {
 
        private int data;
        private Node next;
 
        public Node(int data) {
            this.data = data;       
        }
 
        public int getData() {
            return data;
        }
 
        public void setData(int data) {
            this.data = data;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node next) {
            this.next = next;
        }   
    }
}