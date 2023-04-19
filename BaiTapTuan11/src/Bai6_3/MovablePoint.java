package Bai6_3;

public class MovablePoint implements Movable {
    // khai bao thuoc tinh

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {// constructor
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override //ghide
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override //ghi de cac method cua interface movable
    public void moveUp() {
        System.out.println("Tọa độ y hiện tại đã thay đổi thành "+(y -= ySpeed));
    }

    @Override
    public void moveDown() {
        System.out.println(y += ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(x -= xSpeed);
    }

    @Override
    public void moveRight() {
        System.out.println(x += xSpeed);
    }
}
