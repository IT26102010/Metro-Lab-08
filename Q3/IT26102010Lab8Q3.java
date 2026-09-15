import java.util.Scanner;

public class IT26102010Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error! Please enter a positive number.");
                i--;
            }
            else {
                myArray[i] = number;
            }
        }

        int max = myArray[0];

        for (int i = 1; i < 6; i++) {

            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }
}