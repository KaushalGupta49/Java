import java.util.Scanner;

public class everyProgram {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Mod");
        System.out.println("6. Average");
        System.out.println("7. Power");


        //Enter optiona here
        System.out.println(" ");
        System.out.println("Select operation");
        int n = sc.nextInt();

        switch(n){
            case 1:Sum();
            break;

            case 2:Sub();
            break;
            
            case 3:Mul();
            break;
            
            case 4:Div();
            break;
            
            case 5:Mod();
            break;

            case 6:Average();
            break;

            case 7:Power();
            break;

            // Enter Functions here
            default:System.out.println("Invalid Operation");
        }
    }

    public static void Sum(){
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
    
    public static void Sub(){
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println(sub);
    }
    
    public static void Mul(){
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println(mul);
    }
    
    public static void Div(){
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element");
        int b = sc.nextInt();
        int div = a / b;
        System.out.println(div);
    }

    public static void Mod() {
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element");
        int b = sc.nextInt();
        int mod = a % b;
        System.out.println(mod);
    }

    public static void Average(){
        System.out.println("Enter 1st Element");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Element");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Element");
        int c = sc.nextInt();
        float avg = (a+b+c)/2;
        System.out.println(avg);
    }

    public static void Power() {
        System.out.println("Enter Base");
        int x = sc.nextInt();
        System.out.println("Enter Exponent");
        int n = sc.nextInt();

        System.out.println(XtothePowerN(x,n));
    }

    public static int XtothePowerN(int x,int n) {
        if(n == 0){
            return 1;
        }
        int mul = XtothePowerN(x,n-1);
        int c = x * mul;
        return c;
    }
    
}
