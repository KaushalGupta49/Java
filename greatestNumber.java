import java.util.*;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter a");
        int b = sc.nextInt();

        sc.close();
        greaternumber(a,b);
    }

    public static void greaternumber(int a,int b) {
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
