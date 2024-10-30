public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        if (top == capacity) {
            resize();
        }
        stack[top++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T element = stack[--top];
        stack[top] = null;
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        capacity *= 2;
        T[] newStack = (T[]) new Object[capacity];
        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
    }
}
