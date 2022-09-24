import java.util.*;

public class GreatestCommonDivisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        sc.close();

        int c=0;

        if(a > b){

            for(int i=1;i<=b;i++){
                if(a%i == 0 && b%i == 0){
                    c = i;
                }
            }
        }
        
        else{
            for(int i=1;i<=a;i++){
                if(a%i == 0 && b%i == 0){
                    c = i;
                }
            }
        }

        System.out.println("Greatest Common Divisor");
        System.out.println(c);

        
    }
}