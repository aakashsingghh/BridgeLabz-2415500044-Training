package Queue;

public class ImplementationOfDequeue {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    static class Dequeue {
        Node front;
        Node rear;

        void insertAtFront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                front = newNode;
                rear = newNode;
                return;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
        }

        void insertAtRear(int data) {
            Node newnode = new Node(data);
            if (rear == null) {
                front = newnode;
                rear = newnode;
                return;
            } else {
                newnode.prev = rear;
                rear.next = newnode;
                rear = newnode;
            }
        }

        void display(){
            Node temp = front ;

            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }

        void deleteAtFront(){
            if(front==null){
                return;
            }
            front = front.next;

            if(front!=null){
                front.prev = null;
            }else{
                rear = null;
            }
        }

        void deleteAtRear(){
            if(rear==null){
                return;
            }
            rear = rear.prev;
            if(rear!=null){
                rear.next = null;
            }else{
                front = null;
            }
        }

        public static void main(String[] args) {

            Dequeue q = new Dequeue();
            q.insertAtFront(10);
            q.insertAtFront(20);
            q.insertAtFront(30);
            q.insertAtFront(40);
            q.deleteAtFront();
            q.deleteAtRear();
            q.display();

        }
    }
}
