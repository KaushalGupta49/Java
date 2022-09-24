import java.util.*;

public class arrayfindnumber {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter array element");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the no. to find");
        int number = sc.nextInt();

        for(int i=0;i<size;i++){
            if(number == a[i]){
                System.out.print("Index no. of "+ a[i]+" is ");
                System.out.println(i);
            }
        }
        sc.close();

    }
    
}
