import java.util.*;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        System.out.println("Enter Length");
        int l = sc.nextInt();

        sc.close();

        for(int i=1; i<=b; i++){

            for(int j=1; j<=l; j++){
                 if( i == 1 || i == b || j == 1 || j == l){
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                 }
            }
            System.out.println("");
        }
    }
}
