import java.util.*;

public class CalcFactorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Factorial = factorial(n);
        System.out.println(Factorial);
        sc.close();
    }

    public static int factorial(int n) {
        int fac=1;
        for(int i=n;i>=1;i--){
            fac = fac * i ;
        }
        return fac;
    }
}