package lianbiao;

public class DoubleList {
    public static void main(String[] args) {
        Double head;
        Util util = new Util();
        head=util.create();
        util.add(head,1);
        util.add(head,2);
        util.add(head,3);
        util.add(head,4);
        util.add(head,5);
        util.delete(head,5);
        util.add(head,5);
        util.change(head,10,3);
        util.deleteLast(head);
        util.printAll(head);
        System.out.println(util.search(head,4));
    }
}
