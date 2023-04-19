package Bai6_3;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,4,1,1);// khoi tao doi tuong vs cac thuoc tinh mac dinh
        System.out.println( movablePoint.toString());// in ra trang thai cua doi tuong movablepoint
        movablePoint.moveUp();
        System.out.println( movablePoint.toString());
    }
}
