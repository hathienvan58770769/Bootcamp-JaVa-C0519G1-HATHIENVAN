package baitap3;

public class TestMove {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint);

        moveAblePoint = new MoveAblePoint(3.4f, 2.7f);
        System.out.println(moveAblePoint);

        moveAblePoint = new MoveAblePoint(2.3f, 4.5f, 4.6f, 7.0f);
        System.out.println(moveAblePoint);
    }
}
