import java.util.ArrayList;
import java.util.Scanner;

class Person {
    // write your code here
  public String name;
  public int age;

    Person(String name, int age) {
        // write your code here
      this.name = name;
      this.age = age;
    }

    void introduce() {
        // write your code here
      System.out.print(name+" is "+age+" years old");
    }
}

class Athlete extends Person {
    // write your code here
  public String sport;

    Athlete(String name, int age, String sport) {
        super(name, age);
        // write your code here
    }

    @Override
    void introduce() {
        super.introduce();
        // write your code here
    }
}

class Coach extends Person {
    // write your code here

    Coach(String name, int age, int experience) {
        super(name, age);
        // write your code here
    }

    @Override
    void introduce() {
        super.introduce();
        // write your code here
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取人數n
        int n = scanner.nextInt();
        scanner.nextLine();
        
        // 讀取n個人的資料
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // 讀取一行資料，並以空白字元分割成字串陣列，得出人物類型和相應的屬性:
            // 格式為 "Athlete name age sport" 或 "Coach name age experience"
            String[] input = scanner.nextLine().split(" ");
            
            // 根據不同人的職業類型，建立不同的Person物件，並其加入到persons ArrayList中
            switch (input[0]) {
                case "Athlete":
                    persons.add(new Athlete(input[1], Integer.parseInt(input[2]), input[3]));
                    break;
                case "Coach":
                    persons.add(new Coach(input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3])));
                    break;
            }
        }

        // 逐一呼叫每個Person物件的introduce()方法
        for (Person person : persons) {
            person.introduce();
        }
        
        scanner.close();
    }
}
