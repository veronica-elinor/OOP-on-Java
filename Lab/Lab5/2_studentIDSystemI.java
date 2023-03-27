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
public class Test {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student(1);
		Student student3 = new Student(2, "Bob");
		Student student4 = new Student(3, "Alice", "Electrical Engineering");

		student1.getInfo();
		student2.getInfo();
		student3.getInfo();
		student4.getInfo();
	}
}
