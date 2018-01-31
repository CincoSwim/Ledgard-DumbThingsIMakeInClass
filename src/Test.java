import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int numb;

        Scanner keyn = new Scanner(System.in);

        try {
                System.out.print("Please enter a number between:");
                numb = keyn.nextInt();

                System.out.println("You entered " + numb + ", right?");
            }
        catch (InputMismatchException exception){
                System.out.println("That's not a number, boy.");
                System.out.println("Try again.");

            }
    }
}
