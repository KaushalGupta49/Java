import java.util.*;

class Firstclass{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println(sum);
}
}