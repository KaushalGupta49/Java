import java.util.*;

public class sumoftheDiagonalElement{
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int i,j,sum=0;

        Scanner sc = new Scanner(System.in);

        //array input
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        //array output
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        //main working
        for(i=0;i<3;i++){
            sum = sum + a[i][i];
        }

        System.out.println(sum);

        sc.close();
    }
}