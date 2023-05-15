import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10_Q1_4105031027 {
	public static void main(String[] args) {
		Scanner inputStream = null;
		
		try {
			inputStream = new Scanner (new FileInputStream("workspace/input.txt"));
            		
            
            	}
		catch (FileNotFoundException e) {
            		System.out.println("File input.txt was not found.");
			System.out.println("or could not be opened.");
			System.exit(0);
		}
		
		int num;
            	int count = 0;
            
            	while ((num = inputStream.nextInt()) != null) {
			String[] numbers = num.split(" ");
			for (String number : numbers) {
				if (number.equals("10")) {
					count++;
				}
			}
		}
		System.out.println("The number of occurrences of number 10 is "+count);
		inputStream.close();
	}
}
