import java.util.*;

public class halfpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j <= i ; j++){
                System.out.print("*");      
            }
            System.out.println("");  
        }
    }
}
