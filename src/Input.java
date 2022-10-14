import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        try {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter first number- ");
                int b = sc.nextInt();

                try (Scanner sc1 = new Scanner(System.in)) {
                    System.out.print("Enter Second number- ");
                    int a = sc1.nextInt();
                    int c = (a + b);
                    System.out.println(c);
                }
            }
        } catch (Exception e) {
            System.out.println("wrong Input");

        }

    }
}