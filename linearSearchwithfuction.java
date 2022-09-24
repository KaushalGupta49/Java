import java.util.Scanner;

public class linearSearchwithfuction {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter a elemnt to search");
        int n = sc.nextInt();

        sc.close();

        linearSearch(n,a);
    }

    public static void linearSearch(int n,int a[]) {
        int k=0;

        for(int i=0;i<5;i++){
            if(n == a[i]){
                k=1;
                break;
            }
            else{
                k=0;
            }
        }

        if(k==1){
            System.out.println("Number Found");
        }else{
            System.out.println("Not Found");
        }
        
    }
    
}
