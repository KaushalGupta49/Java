import java.util.*;

public class arrayfindindex {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];

        System.out.println("Enter array element");
        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){
                a[i][j] = sc.nextInt(); 
            }

        }

        System.out.println("Enter the no. to find");
        int number = sc.nextInt();
        sc.close();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(number == a[i][j]){
                    System.out.print("Index no. of "+ a[i][j]+" is ");
                    System.out.print(i + "," + j);
                }    
            }
            
        }
    }
    
}
