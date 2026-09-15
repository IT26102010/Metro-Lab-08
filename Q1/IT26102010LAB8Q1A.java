import java.util.Scanner ;
public class IT26102010Lab8Q1A {

	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in) ;
		//we create the array
		int[] myArray = new int[5];
		
		//Input 5 numbers
		for (int i=0; i<5 ; i++) {
			System.out.print("Enter Number" + (i+1)+": ") ;
			myArray[i] =input.nextInt();
			
		}
		
		//print number in reverse oder
		System.out.print("Number in reverse order: " );
		
		for (int i=4; i>=0 ; i--){
			System.out.print(myArray[ i ] + " ");
		}
	}
}