import java.util.*;

public class Stringsletterchanging {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == 'e'){
                System.out.print("i");
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
