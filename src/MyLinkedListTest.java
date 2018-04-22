
public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1,8);
        list.add(2,3);
        list.add(3,5);
        list.add(4,6);
        list.add(5,89);
        list.add(6,45);
        System.out.println(list);

        list.addLast(9);
        System.out.println(list);

        list.addFirst(90);
        System.out.println(list);

        list.add(6,45);
        System.out.println(list);

        System.out.println(list.getSize());

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.removeIndex(4);
        System.out.println(list);

    }
}
