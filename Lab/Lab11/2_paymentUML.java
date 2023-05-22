abstract class Payment {
    // write your code here
}

class Cash extends Payment {
    // write your code here
}

class Check extends Payment {
    // write your code here
}

class CreditCard extends Payment {
    // write your code here
}

public class Main {
    public static void main(String[] args){
        Cash payment1 = new Cash(100);
        Check payment2 = new Check(50, "1501234121", "Joe King");
        CreditCard payment3 = new CreditCard(1000, "Barry Schmelly", "5142-4123-4231-3231", "10/06");

        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
