import java.util.Scanner;

public class IT26102010Lab8Q1B {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int[] myArray = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
        
        
        int[] evenArray = new int[5];
        int evenCount = 0;
        
        
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i]; 
                evenCount++;
            }
        }
        
        
        System.out.println("myArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); 
        
        
        System.out.println("evenArray Contents:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " "); 
        }
        
    }
}
		
	
