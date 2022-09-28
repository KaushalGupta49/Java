class Shape{
    String color;
}


class Triangle extends Shape{
    public void color(){
        System.out.println("Color of the shape : "+ color);
    }
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }
}


class EquilateralTriangle extends Triangle{

    public void area(int l, int h){
        System.out.println("EqTriangle");
        System.out.println("abcd");
    }
}


public class OOPS{
    public static void main(String[] args) {
        Triangle t1 = new EquilateralTriangle();
        t1.color ="Red";
        t1.color();
        t1.area(10,10);
    }
}