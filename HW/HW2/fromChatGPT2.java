import java.util.Scanner;

public class ValidStreetNumbers {
    // Function to count the occurrence of a digit in a number
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

    public static void main(String[] args) {
        // Read input values
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // Check for invalid input
        if (a <= 0 || b <= 0 || a > b || b > 10000) {
            System.out.println("Invalid input");
            return;
        }

        // Count the number of valid house street numbers
        int count = 0;
        for (int i = a; i <= b; i++) {
            int onesPlace = i % 10;
            int tensPlace = (i / 10) % 10;
            if (onesPlace != tensPlace && countDigitOccurrence(i, onesPlace) == 1 && countDigitOccurrence(i, tensPlace) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
