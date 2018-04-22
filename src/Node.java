public class Node<E> {
    public Node<E> next;
    public E element;

    public Node(E e) {
        this.element = e;
        this.next = null;
    }
}


