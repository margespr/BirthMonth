import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");

        int month = 0;
        String trash = "";

        // Check if the user entered an integer
        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear buffer

            // Check if the integer is in range
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            // User did NOT enter an integer
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }
    }
}

