public class Position<T> {
    private T data;
    private Position<T> prev, next;

    public Position(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(Position<T> next) {
        this.next = next;
    }

    public Position<T> getNext() {
        return this.next;
    }

    public void setPrev(Position<T> prev) {
        this.prev = prev;
    }

    public Position<T> getPrev() {
        return this.prev;
    }
}