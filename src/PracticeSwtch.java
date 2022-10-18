
import java.util.Scanner;

public class PracticeSwtch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Alphabets from A to Z : ");
        String Alphabet = sc.nextLine();
        sc.close();
        // System.out.println("Your Alphabet is " + Alphabet);

        switch (Alphabet) {
            case "A":
                System.out.println("The Word you enter is Vowel");
                break;
            case "E":
                System.out.println("The Word you enter is Vowel");
                break;
            case "I":
                System.out.println("The Word you enter is Vowel");
                break;
            case "O":
                System.out.println("The Word you enter is Vowel");
                break;
            case "U":
                System.out.println("The Word you enter is Vowel");
                break;

            default:
                System.out.println("The Word you enter is consonant");
                break;
        }

    }
}
