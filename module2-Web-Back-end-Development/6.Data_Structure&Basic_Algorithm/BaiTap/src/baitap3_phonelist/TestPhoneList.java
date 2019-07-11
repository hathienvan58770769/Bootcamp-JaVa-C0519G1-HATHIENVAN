package baitap3_phonelist;

public class TestPhoneList {
    public static void main(String[] args) {
        PhoneListNode node1 = new PhoneListNode("diem", "0347662345");
        PhoneListNode node2 = new PhoneListNode("van", "0344569320");
        PhoneListNode node3 = new PhoneListNode("diem", "0790303099");
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(null);
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);

    }
}
