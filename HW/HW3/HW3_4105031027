public class HW3_4105031027 {
	public static void main(String[] args) {
		System.out.println("Enter number of digits in code (3, 4 or 5):");
		Scanner scn = new Scanner(System.in);
		
		//Get the number of digits for the code
		int n = sc.nextInt();  //only 0,3,4,5
		int[] ans = new int[10];
		
		//Load array with code digits
		if (0 == n)//If 0 is input as the number of digits for the code
		{
			System.out.println("Enter code:");
			int code = sc.nextInt();//Get code as a single integer
			BullsAndCows zero = new BullsAndCows(code);
			System.out.println("Enter number of digits in code:");
			int digit = sc.nextInt();//Get the number of digits in the code
			ans = zero.imput_code(digit);
			
			//output the code to be guessed
			System.out.println("Number to guess: ");
			int i = 0;
			while (i < digit) 
			{
				if (i == digit-1) {
					System.out.print(ans[i]);//last digits
				}
				else {
					System.out.print(ans[i]+"-");
				}
				
				i++;
			}
			n = digit;
		}
		
		else//Else randomly create a valid code (i.e. the number of digits was 3, 4 or 5)
		{
			BullsAndCows nonZero = new BullsAndCows(n);
			ans = nonZero.generate_code(n);
			
			//output the code to be guessed
			System.out.println("Number to guess: ");
			int i = 0;
			while (i < n) 
			{
				if (i == n-1) {
					System.out.print(ans[i]);//last digit
				}
				else {
					System.out.print(ans[i]+"-");
				}
				i++;
			}
		}
		
		int x = 0;//bulls
		int y = 0;//cows
		
		//Get guess as a single integer
		while (true) 
		{
			System.out.println("Enter Guess:");
			int input = sc.nextInt();
			int input_test = input;
			int count=0;
			
			//Extract single digits from the single integer and put in an array for the guess
			while (input_test>0) 
			{
				input_test/=10;
				count++;
			}
			
			//Ensure the guess is a valid guess
			if (count > n) //The input has more digits than the number of digits in the code
			{
				System.out.println("You can only enter "+n+" digits.");
				continue;	
			}
			
			int[] test = new int[n];
			for (int i = n-1;i >= 0;i--) 
			{
				test[i] = input%10;
				input/=10;
			}
			
			//check if there are repeated digits in the input
			int flag = 0;
			for (int i = 0; i < n; i++) 
			{
				for (int j = i+1;j < n;j++) 
				{
					if (test[i] == test[j])
					{
						System.out.println("Each number must be different.");
						flag = 1;
						break;
					}
				}
				if (flag == 1)
					break;
			}
			if (flag == 1)
				continue;
			
			//Determine the status of the guess
			for (int i = 0; i < n; i++) 
			{
				if (test[i] == ans[i])
					x++;
				else 
					for (int j = 0; j < n; j++) 
					{
						if (test[j] == ans[i]) 
							y++;
					}
			}
			if (x == n)
				break;
			
			//Report the bulls and cows on separate lines
			System.out.println(x+" bulls\n"+y+" cows");
			x = 0;
			y = 0;
		}
		
		//When the guess matches the code
		System.out.println(n+" bulls ... ");
		int i = 0;
		while (i < n) 
		{
			if (i == n-1)
				System.out.print(ans[i]);
			else
				System.out.print(ans[i]+"-");
			i++;
		}
		System.out.print(" is correct!");
	}
}

class BullsAndCows {
	int code, digit;// Data Members
	
	public BullsAndCows(int input)// Constructor
	{
		code = input;
	}

	// Function Members
	int[] imput_code(int digit) 
	{
		this.digit = digit;
		int[] ans = new int[digit];
		int i = digit;
		while (i > 0) 
		{
			ans[i-1] = code%10;
			code/=10;
			i--;
		}
		return ans;
	}

	int generate_code(int n)
	{
		int[] ans = new int[n];
		for (int i = 0;i < n;i++) 
		{
			ans[i] = (int)(Math.random()*10);//do not exclude repeat digits
			//avoid repeat digits
			for (int j = 0;j < i;j++) 
			{
				if (ans[j] == ans[i]) 
				{
					i--;
					break;
				}
			}
		}
		return ans;
	}
	
}
