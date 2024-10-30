public interface Stack<T> {
    void push(T element); // Adiciona um elemento no topo da pilha
    T pop(); // Remove e retorna o elemento no topo da pilha
    T peek(); // Retorna o elemento no topo da pilha sem remover
    boolean isEmpty();  // Verifica se a pilha esta vazia
    int size(); // Retorna a quantidade de elementos na pilha
}