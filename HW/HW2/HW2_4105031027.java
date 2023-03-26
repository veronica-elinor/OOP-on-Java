import java.util.Scanner;

public class HW2_4105031027 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter numbers a <= b:");
		
		// declare
		int a=scn.nextInt();
		int b=scn.nextInt();

		// Check validity
		if (a<=0 || b<=0 || b<a || a>10000 || b>10000) {
			System.out.println("Invalid input");
			return;
		}
		
	}
	
	// Returns how many times the digit occurs in the number n
	public static int countDigitOccurrence(int n, int digit) {
		int count = 0;
		while (n > 0) {
			if (n % 10 == digit) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
}
