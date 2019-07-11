package baitap3_phonelist;

public class PhoneListNode {
    private String name;
    private String phone;
    private PhoneListNode next;

    private class Node{
        private Object data;
        private Node next;

        public Node(Object obj) {
            this.data = obj;
        }

        public void setData(Object obj) {
            this.data = obj;
        }
        public Object getData() {
            return this.data;
        }
        public void setNext(Node link){
            this.next = link;
        }
        public Node getNext(){
            return this.next;
        }
    }
    public PhoneListNode(String name , String phone ){
        this.name = name;
        this.phone = phone;
    }
    public void setData(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }
    public String getData(){
        return this.name + " " + this.phone;
    }

    @Override
    public String toString() {
        return this.name + " " + this.phone;
    }

    public void setNext(PhoneListNode next) {
        this.next = next;
    }

    public PhoneListNode getNext() {
        return this.next;
    }
}
