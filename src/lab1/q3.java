package lab1;
import java.util.*;

public class q3 {
	public static void main(String[]args) {
		Scanner reader = new Scanner(System.in);
		double[] arr = new double[10]; 
		double total = 0;
		
		System.out.print("How many marks you want to enter : ");
		int i = reader.nextInt();
		System.out.print("\n");
		
		for (int j = 0;j < i&&j < 10;j++) {
			System.out.print("Please enter mark no "+(j+1)+"\n");
			arr[j] = reader.nextDouble();
			System.out.print("Mark : "+ arr[j] +" has been inserted.\n");
			total += arr[j];
		}
		
		System.out.print("Total mark is : "+total+"\nPress any key to continue");
		
	}
}
