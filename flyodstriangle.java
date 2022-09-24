import java.util.*;
public class flyodstriangle {
    public static void main(String[] args) {
        int k=1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        sc.close();

        for(int i=1 ; i<=r ; i++){
            for(int j=1 ; j<=i  ;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
    }
    
}
