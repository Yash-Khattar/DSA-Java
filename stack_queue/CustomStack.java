package stack_queue;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    private int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int val) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return data[ptr--];
    }

    boolean isFull() {
        return ptr == data.length - 1;
    }

    boolean isEmpty() {
        return ptr == -1;
    }

}
