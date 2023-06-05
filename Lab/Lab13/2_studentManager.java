class Student {
    // write your code here
  private String name;
    private int id;
  
    public Student(String name, int id) {
        // write your code here
      this.name = name;
        this.id = id;
    }
    
    public String getName() {
        // write your code here
      return name;
    }
    
    public int getId() {
        // write your code here
      return id;
    }
}

class StudentListManager {
	// write your code here
  private LinkedList<Student> studentList;
  
  public StudentListManager() {
        studentList = new LinkedList<>();
    }

    public void addStudent(String name, int id) {
        // write your code here
      Student student = new Student(name, id);
        studentList.add(student);
    }
    
    public void removeStudent(int id) {
        // write your code here
      ListIterator<Student> iterator = studentList.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
    
    public void printStudentList() {
        // write your code here
      for (Student student : studentList) {
            System.out.println("Name:"+student.getName()+",ID:"+student.getId());
        }
    }
}
