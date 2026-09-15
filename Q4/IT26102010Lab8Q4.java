import java.util.Scanner;

public class IT26102010Lab8Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];

  
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int tempInput = input.nextInt();

            if (tempInput <= 0) {
                System.out.println("Error: please Enter ONLY Positive Numbers");
                i--;
            } else {
                studentsArray[i] = tempInput;
            }
        }
		
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        
    }
}