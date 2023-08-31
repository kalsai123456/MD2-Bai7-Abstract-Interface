package bai3resizeable;

public class Rectangle extends Shape {
    private double height = 1.0;
    private double width = 1.0;

    public Rectangle(){

    }
    public Rectangle(double height,double width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height,double width,String color,boolean filled){
        super(color, filled);
        this.height = height;
        this.width = width;

    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
    }
    public double getArea(){
        return width*this.height;
    }
    public double getPerimeter(){
        return (width + height)*2;
    }



    @Override
    public String toString() {
        return "Hinh chu nhat co" +
                "chieu cao" + getHeight() +
                "chieu rong" + getWidth() +
                "dien tich" +getArea() +
                "chu vi" +getPerimeter() +
                "mau la" +getColor();
    }
    @Override
    public void resize(double percent){
        this.height *= (percent / 200);
        this.width += (percent / 200);
    }
}
