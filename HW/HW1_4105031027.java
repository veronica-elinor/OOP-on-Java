import java.util.Scanner;

public class HW1_4105031027 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String first_name;
		String last_name;
		int birth_year;
		int height;
		
		System.out.println("First name:");
		first_name=scn.nextLine();
		System.out.println("Last name:");
		last_name=scn.nextLine();
		System.out.println("Birth year:");
		birth_year=scn.nextInt();
		System.out.println("Height (cm):");
		height=scn.nextInt();
		
		int this_year=2023;//
		int age=this_year-birth_year;
		float average_growth=((float)height-51)/(float)age;
		
		System.out.println("Hello "+first_name+" "+last_name+".");
		System.out.println("You are "+age+" years old in "+this_year+".");
		System.out.println("Your height is "+height+" cm.");
		System.out.println("You grew an average of "+average_growth+" cm per year (assuming you were 51 cm at birth).");
		
	}
}
