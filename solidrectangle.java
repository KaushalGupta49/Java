import java.util.*;

public class solidrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        System.out.println("Enter Length");
        int l = sc.nextInt();
        sc.close();
        
        for(int i=0 ; i<b ; i++){
            for(int j=0 ; j<l ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
