public class TestClass {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> lista = new DoublyLinkedList<Integer>();
        for(int i = 0; i < 10; i++) {
            lista.add(i + 1);
        }
        lista.print();
        for(int i = 0; i < 11; i++) {
            lista.removeFirst();
        }
        lista.print();
    }
}
