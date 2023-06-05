class Student {
    // write your code here
  private String name;
  private int id;
    public Student(String name, int id) {
        // write your code here
      this.name=name;
      this.id=id;
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
	LinkedList<Student> Students=new LinkedList<Student>();
  

    public void addStudent(String name, int id) {
        // write your code here
      
    }
    
    public void removeStudent(int id) {
        // write your code here
    }
    
    public void printStudentList() {
        // write your code here
      for(int i:arr){
            System.out.print("Name:"+name",ID:"+id);
        }
    }
}
