import java.util.*;

public class xtothepowern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int n = sc.nextInt();
      sc.close(); 

     System.out.print(power(x,n));
    }

    public static int power(int x,int n) {
        
        if(n == 0){
            return 1;
        }

        int mul = power(x,n-1);
        int c = x * mul;
        return c;
    }
}
