package readability;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(text.length() > 100 ? "HARD" : "EASY");
    }
}
