/**
 * Assignment_1
 */

import java.util.Scanner;

public class que2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String str = "example";
        char[] ch = a.toCharArray();
        for (int i = 0; i < 2; i++) {
            if (ch[i] == 'o') {
                System.out.println("o");
            } else if (ch[i] == 'z') {
                System.out.println("z");
            }
        }
    }
}