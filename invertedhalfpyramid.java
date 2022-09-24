import java.util.*;

public class invertedhalfpyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int r = sc.nextInt();
        sc.close();

        for(int i=1 ; i<=r ;i++){
            for(int j=i ; j<=r ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
