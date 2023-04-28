class Product {
	private int id;
	private String name;
	private int inventory;
	private int numSold;
	private String description;
	private double totalPaid;
	private static int counter = 0;
	
	public Product(int productID, String productName)
	{
		this.id = productID;
		this.inventory = 0;
		this.numSold = 0;
		this.totalPaid = 0.0;
		setName(productName);
	}

	public final int getID()
	{
		return id;
	}

	public final String getName()
	{
		return name;
	}

	public final void setName(String productName)
	{
		if (productName.length() > 0)
		{
			this.name = productName;
		}
		else
		{
			counter++;
			this.name = "Product "+counter;
		}
	}

	public final String getDescription()
	{
		return description;
	}

	public final void setDescription(String description)
	{
		this.description = description;
	}

	public final int getNumberSold()
	{
		return numSold;
	}

	public final double getTotalPaid()
	{
		return totalPaid;
	}

	public final int getInventoryCount()
	{
		return inventory;
	}

	public final boolean addShipment(int shipmentQuantity, double shipmentCost)
	{
		if (shipmentQuantity < 0 || shipmentCost < 0)
		{
			return false;
		}
		else
		{
			inventory += shipmentQuantity;
			totalPaid += shipmentCost;
		}
		
		return true;
	}

	public final boolean reduceInventory(int purchaseQuantity)
	{
		if (purchaseQuantity < 0)
		{
			return false;
		}
		if (inventory < purchaseQuantity)
		{
			return false;
		}
		inventory -= purchaseQuantity;
		numSold += purchaseQuantity;
		
		return true;
	}

	public final double getPrice()
	{
		if ((inventory + numSold) == 0)
		{
			return -1;
		}
		return 1.25 * totalPaid / (inventory + numSold);
	}
}


class Customer {
	private int id;
	private String name;
	private boolean credit;
	private double balance;
	private String[] recentPurchases = new String[5];
	private int numPurchased;
	private static int counter = 0;
	
	public Customer(int customerID, String name, boolean credit) {
		// TODO Complete your code here.
	}

	public int getID() {
		// TODO Complete your code here. 
		
		// TODO You can change or move the following return statement if necessary.
		return 0;
	}
	
	public String getName() {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return null;
	}
	
	public void setName(String customerName) {
		// TODO Complete your code here.
	}

	public boolean getCredit() {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public void setCredit(boolean hasCredit) {
		// TODO Complete your code here.
	}

	public double getBalance() {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return 0;
	}
	
	public boolean processPayment(double amount) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public boolean processPurchase(double amount, Product product) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public void outputRecentPurchases() {
		// TODO Complete your code here.
	}
}


class Store {
	private String name;
	private Product[] products = new Product[100];
	private Customer[] customers = new Customer[100];
	private int numProducts;
	private int numCustomers;
	private static int counter = 0;

	public Store() {
		// TODO Complete your code here.
	}
	
	public Store(String name) {
		// TODO Complete your code here.
	}
	
	public String getName() {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return null;
	}
	
	public void setName(String storeName) {
		// TODO Complete your code here.
	}

	public boolean addProduct(int productID, String productName) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public Product getProduct(int productID) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return products[0];
	}

	public boolean addCustomer(int customerID, String customerName, boolean credit) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public Customer getCustomer(int customerID) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return customers[0];
	}


	public boolean takeShipment(int productID, int quantity, double cost) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public boolean sellProduct(int customerID, int productID, int quantity) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public boolean takePayment(int customerID, double amount) {
		// TODO Complete your code here.
		
		// TODO You can change or move the following return statement if necessary.
		return true;
	}

	public void outputProducts(Product product) {
		// TODO Complete your code here.
	}

	public void outputCustomers(Customer customer) {
		// TODO Complete your code here.
	}
}


public class HW5 {
	public static void main(String[] args) {
		Product p = new Product(17, "Jill");
		System.out.println("p (id): "+p.getID());
		System.out.println("p (name): "+p.getName());
		System.out.print("\n");

		Product q = new Product(183, "Tom");
		System.out.println("q (id): "+q.getID());
		System.out.println("q (name): "+q.getName());
		System.out.print("\n");

		Product badP = new Product(222, "");
		System.out.println("badP (id): "+badP.getID());
		System.out.println("badP (name): "+badP.getName());
		System.out.print("\n");

		p.setName("Jill Extreme");
		System.out.println("p (name): "+p.getName());
		q.setName("");
		System.out.println("q (name): "+q.getName());
		p.setDescription("This is a fantastic product.");
		System.out.println("p (description): "+p.getDescription());
		q.setDescription("");
		System.out.println("q (description): "+q.getDescription());
		System.out.print("\n");

		System.out.println("Before 1st shipment");
		System.out.println("inventory: "+p.getInventoryCount());
		System.out.println("totalPaid: "+p.getTotalPaid());
		System.out.println("price: "+p.getPrice());
		System.out.println("numSold: "+p.getNumberSold());
		System.out.print("\n");

		p.addShipment(88, 230.44);
		System.out.println("After 1st shipment");
		System.out.println("inventory: "+p.getInventoryCount());
		System.out.println("totalPaid: "+p.getTotalPaid());
		System.out.println("price: "+p.getPrice());
		System.out.println("numSold: "+p.getNumberSold());
		System.out.print("\n");

		p.addShipment(133, 142.11);
		System.out.println("After 2nd shipment");
		System.out.println("inventory: "+p.getInventoryCount());
		System.out.println("totalPaid: "+p.getTotalPaid());
		System.out.println("price: "+p.getPrice());
		System.out.println("numSold: "+p.getNumberSold());
		System.out.print("\n");

		System.out.println("Testing negative quantity");

		if (!p.addShipment(-5, 22.55))
			System.out.println("shipment failed");
		else
			System.out.println("shipment passed");

		System.out.println("After failed shipment (nothing should change from last output)");
	}
}
