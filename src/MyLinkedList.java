public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = new Node(null);
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        Node<E> lastNode = new Node<>(e);
        if (tail == null) {
            tail = head = lastNode;
        } else {
            tail.next = lastNode;
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index == 0) addFirst(element);
        else if (index > size) addLast(element);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(element);
            (current.next).next = temp;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> previous = head;
            head = previous.next;
            size--;
            return previous.element;
        }
    }

    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            tail = head = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> curent = head;
            for (int i = 0; i < size - 2; i++) {
                curent = curent.next;
            }
            Node<E> temp = tail;
            tail = curent;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E removeIndex(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public void clear(){

    }

//    public boolean contains(E o){
//
//    }

    public String toString() {
        Node temp = head;
        String list = "";
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        return list;
    }
}
