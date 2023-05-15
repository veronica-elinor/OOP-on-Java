import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10_Q2_4105031027 {
	public static void main(String[] args) {
		File filename = new File("workspace/input.txt");
		try {
            		BufferedReader reader = new BufferedReader(new FileReader(filename));
		}
		catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
		}
		String num;
		double sum = 0;
		int count = 0;
		while ((num = reader.readLine()) != null) {
                	double number = Double.parseDouble(num);
                	sum += number;
                	count++;
		}
		double average = sum / count;
		System.out.println("Average: "+average);
		reader.close();
	}
}
