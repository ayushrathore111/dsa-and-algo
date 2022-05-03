public class Queue {
    int front ,rear, size;
    int capacity;
    int arr[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size;
        rear = capacity-1;
        arr = new int[this.capacity];

    }
    boolean isFull(Queue queue)
    {
        return (queue.size == queue.capacity);
    }
 
    // Queue is empty when size is 0
    boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }
    void enqueue(int item) {
        if(isFull(this)) {
            return;
            this.rear = (this.rear+1) % this.capacity;
            this.arr[this.rear] = item;
            this.size = this.size+1;
            System.out.println(item+"enqueued to queue");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
