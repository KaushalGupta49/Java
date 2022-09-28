class Shape{
    String color;
    
    public void color(){
        System.out.println("Color of the shape : "+ color);
    }
}


class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle");
        System.out.println((l*h)/2);
    }
}


class Rectangle extends Shape{

    public void area(int l, int b){
        System.out.println("Area of Rectangle");
        System.out.println(l*b);
    }
}


public class OOPS{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.color ="Red";
        r1.color();
        r1.area(10,10);
    }
}