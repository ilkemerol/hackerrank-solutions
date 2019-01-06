import java.util.Scanner;

public class solveMeFirst {

    public static int sumOfTwoDigits(int first, int second) {
        return first + second;
    }

    public static void main( String args[] ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, Enter the first digit: ");
        int firstDigit = in.nextInt();
        System.out.println("Please, Enter the second digit: ");
        int secondDigit = in.nextInt();
        in.close();
        System.out.println(sumOfTwoDigits(firstDigit, secondDigit));
    }
}