import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10_Q3_4105031027 {
	public static void main(String[] args) {
		File filename = new File("input.txt");
		
		System.out.println("The number of occurrences of number 10 is "+count);
	}
}

class StudentDataIO{
  public void writeData(Student[] students, String filename){}
  public Student[] readData(String filename)
}
class StudentDataIO {
    public void writeData(Student[] students, String filename) {
        // TODO: Write each student's information to the file.
    }

    public Student[] readData(String filename) {
        // TODO: Read the student information from the file and return a list containing
        // all the students.
    }
}

class Student {
    private String id;
    private String name;
    private int score;

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
