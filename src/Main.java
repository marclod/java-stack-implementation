public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento no topo: " + stack.peek()); // 30
        System.out.println("Tamanho da pilha: " + stack.size()); // 3

        System.out.println("Removido: " + stack.pop()); // 30
        System.out.println("Elemento no topo: " + stack.peek()); // 20
        System.out.println("Tamanho da pilha: " + stack.size()); // 2

        System.out.println("A pilha está vazia? " + stack.isEmpty()); // false
    }
}