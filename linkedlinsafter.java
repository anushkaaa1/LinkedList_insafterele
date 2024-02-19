public class linkedlinsafter {
    Node head,tail;

    public linkedlinsafter(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int num){
        Node n = new Node(num);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            while(head!= null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void insafter(int posele,int value){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(posele==temp.data){
                    break;
                }
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("element not found");
            }
            else{
                Node n = new Node(value);
                n.next = temp.next;
                temp.next = n;
            }
        }
    }
    public static void main(String args[]){
        linkedlinsafter l = new linkedlinsafter();
        l.create(1);
        l.create(2);
        l.create(3);
        l.create(4);
        l.create(5);
        l.print(l.head);
        System.out.println();
        l.insafter(8, 9);
        l.print(l.head);
    }
}
