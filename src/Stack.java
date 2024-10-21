public interface Stack<T> {
    void push(T element);   // Insere um elemento
    T pop();                // Remove e retorna o topo
    T peek();               // Mostra o topo sem remover
    boolean isEmpty();      // Verifica se está vazia
    int size();             // Retorna o tamanho
}
