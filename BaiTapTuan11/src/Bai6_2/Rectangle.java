package Bai6_2;

public class Rectangle implements GeometricObject {//tao dt rectangle co mqh cando vs interface...
    //khai bao thuoc tinh cua hcn
    private double width;
    private double lenght;


    public Rectangle(double width, double lenght) {//constructor
        this.width = width;
        this.lenght = lenght;
    }

    @Override//ghide
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    @Override
    public double getArea() {
        return width * lenght;
    }// dien tich

    @Override
    public double getPerimeter() {
        return (width + lenght) * 2;
    }// chu vi
}
