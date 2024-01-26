package stack_queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFALUT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFALUT_SIZE);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void insert(int val) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        data[end++] = val;
        end = end % data.length;
        size++;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue underflow");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;

    }

    public void display() {
        int i = front;
        do {
            System.err.println(data[i]);
            i++;
            i = i % data.length;
        } while (i != end);
    }

}