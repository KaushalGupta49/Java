import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Mod");

        
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int operator = sc.nextInt();

        System.out.println(" ");

        switch(operator){
            case 1:int sum = a + b;
            System.out.println(sum);
            break;

            case 2:int sub = a - b;
            System.out.println(sub);
            break;
            
            case 3:int mul = a * b;
            System.out.println(mul);
            break;
            
            case 4:int div = a / b;
            System.out.println(div);
            break;
            
            case 5:int mod = a % b;
            System.out.println(mod);
            break;

            default:System.out.println("Invalid Case");
            
        }
        sc.close();
    }
    
}
