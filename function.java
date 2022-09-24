import java.util.*;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = Sum(a,b);
        System.out.println(sum);

        int mul = Mul(a,b);
        System.out.println(mul);
    }

    public static int Sum(int a , int b) {
        int sum=a+b;
        return sum;
    }

    public static int Mul(int a , int b) {
        int mul=a*b;
        return mul;
    }
    
}
