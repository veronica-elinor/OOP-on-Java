import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract int getSalary();
}

class FixedSalaryEmployee extends Employee {
    // Write your code here
  int fixedSalary;
  
  public FixedSalaryEmployee() {
  	super();
    this.fixedSalary=fixedSalary;
  }
  
  public getSalary() {
  	return fixedSalary;
  }
}

class HourlySalaryEmployee extends Employee {
    // Write your code here
  int hourlyRate;
  int hoursWorked;
  
  public HourlySalaryEmployee() {
  	super();
    this.hourlyRate=hourlyRate;
    this.hoursWorked=hoursWorked;
  }
  
  public getSalary() {
  	return hourlyRate*hoursWorked;
  }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取員工人數n
        int n = scanner.nextInt();

        // 創建一個員工列表
        ArrayList<Employee> employees = new ArrayList<>();

        // 讀取n個員工的資料
        for (int i = 0; i < n; i++) {
            // 讀取員工類型、姓名和ID
            String type = scanner.next();
            String name = scanner.next();
            String id = scanner.next();

            // 根據員工類型建立對應的員工物件，並加入到employees ArrayList中
            switch (type) {
                case "F":
                    // 讀取固定薪資員工的薪資
                    int fixedSalary = scanner.nextInt();
                    employees.add(new FixedSalaryEmployee(name, id, fixedSalary));
                    break;
                case "H":
                    // 讀取計時薪資員工的時薪和工作時數
                    int hourlyRate = scanner.nextInt();
                    int hoursWorked = scanner.nextInt();
                    employees.add(new HourlySalaryEmployee(name, id, hourlyRate, hoursWorked));
                    break;
            }
        }

        // 逐一輸出每個員工的姓名、ID和薪資
        for (Employee employee : employees) {
            System.out.printf("%s %s %d\n", employee.name, employee.id, employee.getSalary());
        }
    }
}
