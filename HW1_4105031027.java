import java.util.Scanner;

public class HW1_4105031027 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String first_name;
		String last_name;
		int birth_year;
		int height;
		
		System.out.println("First name:");//名字
		first_name=scn.nextLine();//輸入字串
		System.out.println("Last name:");//姓氏
		last_name=scn.nextLine();//輸入字串
		System.out.println("Birth year:");//出生年分
		birth_year=scn.nextInt();//輸入整數
		System.out.println("Height (cm):");//身高
		height=scn.nextInt();//輸入整數
		
		int this_year=2023;//現今年分
		int age=this_year-birth_year;//年齡為現今年份減去出生年分
		float average_growth=((float)height-51)/(float)age;
		
		System.out.println("Hello "+first_name+" "+last_name+".");
		System.out.println("You are "+age+" years old in "+this_year+".");
		System.out.println("Your height is "+height+" cm.");
		System.out.println("You grew an average of "+average_growth+" cm per year (assuming you were 51 cm at birth).");
		
	}
}
