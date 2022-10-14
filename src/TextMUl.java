import java.util.Scanner;

public class TextMUl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ANy Number---");
        int a = sc.nextInt();
        System.out.println("Enter ANy Number---");
        int b = sc.nextInt();
        sc.close();
        int c = a * b;
        System.out.println(c);
    }

}
