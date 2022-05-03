import java.util.*;
public class QueueA {
    static class Queue{
        static int arr[];
        static int rear =-1;
        static int size;
        static int front =-1;
        Queue(int size){
            arr = new int[size];
            this.size = size;

        }
        public Queue() {
        }
        public static boolean isEmpty(){
            return rear ==-1 && front ==-1;

        }
        public static boolean isFull(){
            return (rear +1)% size == front;

        }

        public static void add(int data){
            if(isFull()){
                System.out.println("full queue..");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public static int remove(){
            if(rear ==size-1){
                System.out.println("empty queue...");
                return -1;
            }
            int result= arr[front];
            if(rear ==front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            rear--;
            return result;
        }
        public static int peek(){
            if(rear ==(size-1)){
                System.out.println("full queue");
                return -1;
            }
            
            return arr[front];
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
    
}
