import java.util.*;

public class recurfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        fibonacci(n-2,a,b);
    }

    public static void fibonacci(int n ,int a,int b){
        if(n == 0){
            return;
        }
        int sum = a + b;
        System.out.print(sum+ " ");
        fibonacci(n-1 , b ,sum);
    }
}
