public class CodeTester {
    public static void main(String[] args) {
        // 1. Create a list of students.
        Student[] students = new Student[3];
        students[0] = new Student("001", "Alice", 95);
        students[1] = new Student("002", "Bob", 88);
        students[2] = new Student("003", "Charlie", 90);

        // 2. Use the StudentData class to write the list of students to a file.
        StudentDataIO sdWrite = new StudentDataIO();
        String filename = "students.txt";
        sdWrite.writeData(students, filename);

        // 3. Read the list of students from the file.
        StudentDataIO sdRead = new StudentDataIO();
        Student[] readStudents = sdRead.readData(filename);

        // 4. Check if the written and read student lists are the same.
        if (students.length != readStudents.length) {
            System.out.println("Fail: The number of students is not the same.");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            Student writeStudent = students[i];
            Student readStudent = readStudents[i];
            if (!writeStudent.getId().equals(readStudent.getId())
                    || !writeStudent.getName().equals(readStudent.getName())
                    || !(writeStudent.getScore() == readStudent.getScore())) {
                System.out.println("Fail: The student data is not the same.");
                return;
            }
        }

        System.out.println("Test pass!");
    }
}
