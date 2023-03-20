import java.util.Scanner;

public class HW2_4105031027 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		// input setting
		int a;
		int b;
		
		// Check validity
		if (a <= 0 || b <= 0 || b < a || a > 10000 || b > 10000) {
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println("Enter numbers a <= b:");
		a=scn.nextInt();
		b=scn.nextInt();
	}
	
	public static int countDigitOccurrence (int n, int digit){
	}
}

// from chatGPT
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Check input validity
        if (a <= 0 || b <= 0 || b < a || a > 10000 || b > 10000) {
            System.out.println("Invalid input");
            return;
        }

        int count = 0;

        // Iterate through all numbers between a and b
        for (int i = a; i <= b; i++) {
            if (hasRepeatedDigits(i)) {
                continue;  // skip numbers with repeated digits
            }
            count++;
        }

        System.out.println(count);
    }

    // Returns true if n contains repeated digits, false otherwise
    public static boolean hasRepeatedDigits(int n) {
        for (int i = 0; i <= 9; i++) {
            if (countDigitOccurrence(n, i) > 1) {
                return true;
            }
        }
        return false;
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
