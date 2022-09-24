import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = 1 , b = 1 , temp;
        int n = sc.nextInt();
        sc.close();

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=2;i<=n;i++){
            temp = b;
            b = a + b;
            a = temp;

            System.out.print(b+" ");
        }
    }
    
}
