import java.util.*;

public class radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        
        double PI = 3.142857142857143;
        double Circumference = 2*PI*r;
        System.out.println(Circumference);

        double Area = PI*r*r;
        System.out.println(Area);
    }
    
}
