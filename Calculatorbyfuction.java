import java.util.*;

public class Calculatorbyfuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Mod");
        System.out.println(" ");
        System.out.println("Select operation");
        int operator = sc.nextInt();

        sc.close();

        switch(operator){
            case 1:Sum(a,b);
            break;

            case 2:Sub(a,b);
            break;
            
            case 3:Mul(a,b);
            break;
            
            case 4:Div(a,b);
            break;
            
            case 5:Mod(a,b);
            break;

            default:System.out.println("Invalid Operation");
        }
    }
    
    public static void Sum(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
    
    public static void Sub(int a,int b){
        int sub = a - b;
        System.out.println(sub);
    }
    
    public static void Mul(int a,int b){
        int mul = a * b;
        System.out.println(mul);
    }
    
    public static void Div(int a,int b){
        int div = a / b;
        System.out.println(div);
    }

    public static void Mod(int a,int b) {
        int mod = a % b;
        System.out.println(mod);
    }
}

