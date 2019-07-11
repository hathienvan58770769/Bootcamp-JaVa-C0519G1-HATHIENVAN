package thuchanh1_list;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInt = new  MyList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(3);
        listInt.add(4);

        System.out.println("element 4 : " + listInt.get(4));
        System.out.println("element 1 : " + listInt.get(1));
        System.out.println("element 3 : " + listInt.get(3));
        System.out.println("element 2 : " + listInt.get(2));


    }
}
