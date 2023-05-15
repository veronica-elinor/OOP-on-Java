class StudentDataIO {
    public void writeData(Student[] students, String filename) {
        // TODO: Write each student's information to the file.
	    try (PrintWriter writer = new PrintWriter(filename)) {
            for (Student student : students) {
                writer.println(student.getId() + "," + student.getName() + "," + student.getScore());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing the data to the file.");
            e.printStackTrace();
        }
    }

    public Student[] readData(String filename) {
        // TODO: Read the student information from the file and return a list containing
        // all the students.
	    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String id = data[0];
                    String name = data[1];
                    int score = Integer.parseInt(data[2]);
                    Student student = new Student(id, name, score);
                    studentList.add(student);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the data from the file.");
        }

        return studentList.toArray(new Student[0]);
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
