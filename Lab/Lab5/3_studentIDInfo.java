class Student {
  // Declaring member variables here
  private int id;
  private String name;
  private String department;

  public Student() {
    // please write your code here
    id = 0;
    name = "John";
    department = "Computer Science";
  }

  public Student(int id) {
    // please write your code here
    this.id = id;
  }

  public Student(int id, String name) {
    // please write your code here
    this.id = id;
    this.name = name;
  }

  public Student(int id, String name, String department) {
    // please write your code here
    this.id = id;
    this.name = name;
    this.department = department;
  }

  public void getInfo() {
    // please write your code here
    System.out.println("Student id = " + id);
    System.out.println("Student name = " + name);
    System.out.println("Student department = " + department);
  }
}
//testing function
class StudentInfoSystem {
	// Declaring member variables here
	private Student student;

	public StudentInfoSystem() {
		// please write your code here
      this.student = new Student(1001, "John", "Computer Science");
	}

	public void updateStudent(Student student) {
		// please write your code here
      this.student = student;
	}

	public void printInfo() {
		// please write your code here
      this.student.getInfo();
	}
}
public class Test {
	public static void main(String[] args) {
	    StudentInfoSystem SIS = new StudentInfoSystem();
	    SIS.printInfo();
	    Student student1 = new Student(5555, "Bob", "Physics");
	    SIS.updateStudent(student1);
	    SIS.printInfo();
	}
}
