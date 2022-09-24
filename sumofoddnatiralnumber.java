import java.util.*;

public class sumofoddnatiralnumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }   
}
