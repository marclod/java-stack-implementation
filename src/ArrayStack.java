import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int top;  // Indice do proximo elemento vazio
    private int capacity;  // Capacidade inicial da pilha

    @SuppressWarnings("unchecked")  // Construtor para inicializar a pilha
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        if (top == capacity) {  // Verifica se a pilha esta cheia
            resize();
        }
        stack[top++] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = stack[--top];
        stack[top] = null;  // Remove a referencia para evitar vazamento de memoria
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
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

    @SuppressWarnings("unchecked") // Metodo auxiliar para dobrar a capacidade do array quando necessario
    private void resize() {
        capacity *= 2;
        T[] newStack = (T[]) new Object[capacity];
        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
    }
}
