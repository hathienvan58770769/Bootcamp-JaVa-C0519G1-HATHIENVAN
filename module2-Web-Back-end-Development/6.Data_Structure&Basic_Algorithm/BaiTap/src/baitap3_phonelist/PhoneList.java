package baitap3_phonelist;

public class PhoneList {
    private PhoneListNode head;
    public PhoneList(){
        head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void insert(PhoneListNode node){
        if (isEmpty()){
            head = node;
        }
        else {
            PhoneListNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }
    public String getPhone(String name) {
        if (isEmpty()) {
            return "Phone list is empty";
        } else {
            PhoneListNode current = head;
            while ((current.getNext() != null) && (!current.getName().equals(name))) {
                current = current.getNext();
            }
                if (current.getName().equals(name))
                    return current.getData();
                else
                    return "Sorry , no entry for " + name;


        }
    }
    public String remove( String name){
        if (isEmpty()){
            return "Phone list is empty";
        }
        PhoneListNode current = head;
        PhoneListNode previous = null;
        if (current.getName().equals(name)){
            head = current.getNext();
            return "Removed " + current.toString();
        }
        while ((current.getNext() != null) && (!current.getName().equals(name))){
            previous = current;
            current = current.getNext();
        }
        if (current.getName().equals(name)){
            previous.setNext(current.getNext());
            return "Remove " + current.toString();
        }else {
            return "Sorry, no entry for " + name;
        }
    }
    public void print(){
        if (isEmpty()){
            System.out.println("Phone list is empty");
        }else {
            PhoneListNode current = head;
            while (current != null){
                System.out.println(current.toString());
                current = current.getNext();
            }
        }
    }
}
