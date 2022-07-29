import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    // cin>>a;
        int b = sc.nextInt();

        int c = a % 10;
        int d = b % 10;

        if (c == d){
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
}