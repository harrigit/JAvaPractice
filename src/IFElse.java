import java.util.Scanner;

public class IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: X==");
        int x = sc.nextInt();
        System.out.println("Enter Second  Number: Y==1");
        int y = sc.nextInt();
        sc.close();
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("LAala Ma Y Wada HAn ");
        }
    }
}
