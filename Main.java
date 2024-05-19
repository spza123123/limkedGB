package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addLast(11111);
        System.out.println(list);
        System.out.println("Size is " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));



    }

}
