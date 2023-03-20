class BankAccount  {
	private String accountName;
	private String accountNumber;
	private double balance;
	private String accountType;

  public void setup (String name, String number, String type) {
	this.accountName = name;
    this.accountNumber = number;
    this.balance = 0.0;
    this.accountType = type;
  }
  
  // deposit
  public void deposit(double amount) {
    this.balance+=amount;
  }
  
  // withdraw
  public void withdraw(double amount) {
	if (this.balance<amount) {
            System.out.println("Insufficient balance");
        }
    else {
            this.balance-=amount;
        }
  }

  public void setAccountType(String type) {
    if (accountType.equals("Savings") || accountType.equals("Checking")) {
        this.accountType = type;
    } else {
        System.out.println("Invalid account type");
    }
  }

  // don't adapt the following code
  public void getAccountInfo() {
    System.out.println("Account name: " + accountName);
    System.out.println("Account number: " + accountNumber);
    System.out.println("Account balance: " + balance);
    System.out.println("Account type: " + accountType);
  }
}
