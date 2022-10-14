import java.util.Scanner;

public class TextMUl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ANy Number---");
        int a = in.nextInt();
        // in.close();
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter ANy Number---");
        int b = in1.nextInt();
        // in1.close();
        int c = a * b;
        System.out.println(c);
    }

}
