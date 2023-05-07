public class HW5 
{
	public static void main(String[] args) 
	{
		Product p = new Product(17, "Jill");
		System.out.println("Product Name(p): "+p.getName());
		System.out.println("Product ID(p): "+p.getID());
		System.out.print("\n");
		
		Product q = new Product(183, "Tom");
		System.out.println("Product Name(q): "+q.getName());
		System.out.println("Product ID(q): "+q.getID());
		System.out.print("\n");
		
		Product badP = new Product(222, "");
		System.out.println("Product Name(b): "+badP.getName());
		System.out.println("Product ID(b): "+badP.getID());
		System.out.print("\n");
		
		p.setName("Jill Extreme");
		System.out.println("Product Name(p): "+p.getName());
		q.setName("");
		System.out.println("Product Name(q): "+q.getName());
		p.setDescription("This is a fantastic product.");
		System.out.println("Description(p): "+p.getDescription());
		q.setDescription("");
		System.out.println("Description(q): "+q.getDescription());
		System.out.print("\n");
		
		System.out.println("Before 1st shipment");
		System.out.println("Inventory: "+p.getInventoryCount());
		System.out.println("Number Sold: "+p.getNumberSold());
		System.out.println("Total Paid: "+p.getTotalPaid());
		System.out.println("Price: "+p.getPrice()); //
		System.out.print("\n");
		
		p.addShipment(88, 230.44);
		System.out.println("After 1st shipment");
		System.out.println("Inventory: "+p.getInventoryCount());
		System.out.println("Number Sold: "+p.getNumberSold());
		System.out.println("Total Paid: "+p.getTotalPaid());
		System.out.println("Price: "+p.getPrice()); //
		System.out.print("\n");
		
		p.addShipment(133, 142.11);
		System.out.println("After 2nd shipment");
		System.out.println("Inventory: "+p.getInventoryCount());
		System.out.println("Number Sold: "+p.getNumberSold());
		System.out.println("Total Paid: "+p.getTotalPaid());
		System.out.println("Price: "+p.getPrice());
		System.out.print("\n");
		
		System.out.println("Testing negative quantity");
		if (!p.addShipment(-5, 22.55))
			System.out.println("shipment failed");
		else
			System.out.println("shipment passed");
		System.out.println("After failed shipment (nothing should change from last output)");
		System.out.println();
		
		//======自己設定測資======= 
		Customer c=new Customer(123,"cc",true);
		c.processPurchase(5, p);
		c.processPurchase(3, p);
		c.processPurchase(2, q);
		Store s=new Store("aa");
		s.outputProducts(p);
		System.out.println();
		s.outputCustomers(c);
		//========================
	}
}
class Product 
{
	private int id;
	private String name;
	private int inventory;
	private int numSold;
	private String description;
	private double totalPaid;
	private static int counter=0;
	public Product(int productID, String productName)
	{
		this.id = productID;
		this.inventory=0;
		this.numSold=0;
		this.totalPaid=0.0;
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
		if (productName.length()>0)
			this.name=productName;
		else
		{
			counter++;
			this.name="Product "+counter;
		}
	}
	public final String getDescription()
	{
		return description;
	}
	public final void setDescription(String description)
	{
		this.description=description;
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
		if(shipmentQuantity<0||shipmentCost<0)
			return false;
		inventory+=shipmentQuantity;
		totalPaid+=shipmentCost;
		return true;
	}
	public final boolean reduceInventory(int purchaseQuantity)
	{
		if(purchaseQuantity<0||inventory<purchaseQuantity)
			return false;
		inventory-=purchaseQuantity;
		numSold+=purchaseQuantity;
		return true;
	}
	public final double getPrice()
	{
		if((inventory+numSold)==0)
			return -1;
		return 1.25*totalPaid/(inventory+numSold);
	}
}
class Customer 
{
	private int id;
	private String name;
	private boolean credit;
	private double balance;
	private String[] recentPurchases=new String[5];
	private int numPurchased;
	private static int counter=0;
	public Customer(int customerID,String name,boolean credit) 
	{
		this.id=customerID;
		this.credit=credit;
		this.balance=0.0;
		this.numPurchased=0;
		setName(name);
	}
	public int getID() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String customerName) 
	{
		if (customerName.length()>0)
			this.name=customerName;     //有名字就輸入名字
		else
		{
			counter++;                  //沒名字就預設數字
			this.name="Customer "+counter;
		}
	}
	public boolean getCredit() 
	{
		return credit;
	}
	public void setCredit(boolean hasCredit) 
	{
		this.credit=hasCredit;
	}
	public double getBalance() 
	{
		return balance;
	}
	public boolean processPayment(double amount) 
	{
		if(amount<0)
			return false;
		balance+=amount;
		return true;
	}
	public boolean processPurchase(double amount,Product product) 
	{
		if (amount>=0&&(credit==true||balance>=amount))
		{
			balance-=amount;
			for(int i=0;i<5;i++)
			{
				if(product.getName().equals(recentPurchases[i]))  
					return true;     //重複購買則不新增最近購買清單
			}
			for(int i=4;i>0;i--)     //調整最近購買清單順序
				recentPurchases[i]=recentPurchases[i-1];
			recentPurchases[0]=product.getName();
			return true;
		}
		return false;
	}
	public void outputRecentPurchases() 
	{
		for(int i=0;i<5;i++)
		{
			if(recentPurchases[i]!=null)
				System.out.println(recentPurchases[i]);
		}
	}
}
class Store 
{
	private String name;
	private Product[] products=new Product[100];
	private Customer[] customers=new Customer[100];
	private int numProducts;
	private int numCustomers;
	private static int counter=0;
	public Store() 
	{
		numProducts=0;
		numCustomers=0;
		setName("");      //預設值為空值
	}
	public Store(String name) 
	{
		numProducts=0;
		numCustomers=0;
		setName(name);
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String storeName) 
	{
		if(storeName.length()>0)
			this.name=storeName;
		else
		{
			counter++;  //預設值用數字表示
			this.name="Store "+counter;
		}
	}
	public boolean addProduct(int productID,String productName) 
	{
		if(numProducts>=products.length)  //數量超過上限回傳false
			return false;
		for(int i=0;i<numProducts;i++)
		{
			if(productID==products[i].getID())
				return false;    //當產品名重複則回傳false
		}
		products[numProducts]=new Product(productID,productName);
		numProducts++;  //當條件符合，可增加產品數量
		return true;
	}
	public Product getProduct(int productID) 
	{
		for(int i=0;i<numProducts;i++)
		{
			if(productID==products[i].getID())
				return products[i];
		}
		return null;
	}
	public boolean addCustomer(int customerID, String customerName, boolean credit) 
	{
		if(numCustomers>=customers.length)  //作法同addProduct
			return false;
		for(int i=0;i<numCustomers;i++)
		{
			if(customerID==customers[i].getID())
				return false;
		}
		customers[numCustomers]=new Customer(customerID,customerName,credit);
		numCustomers++;
		return true;
	}
	public Customer getCustomer(int customerID) 
	{
		for(int i=0;i<numCustomers;i++)
		{
			if(customerID==customers[i].getID())
				return customers[i];
		}
		return null;
	}
	public boolean takeShipment(int productID, int quantity, double cost) 
	{
		if(getProduct(productID)==null)
			return false;
		getProduct(productID).addShipment(quantity,cost);
		return true;
	}
	public boolean sellProduct(int customerID, int productID, int quantity) 
	{
		if(getCustomer(customerID)!=null&&
				getProduct(productID)!=null&&
				quantity>=0&&
				getProduct(productID).getPrice()!=-1.0&&
				quantity<=getProduct(productID).getInventoryCount()&&
				(getCustomer(customerID).getCredit()==true||
				getCustomer(customerID).getBalance()>=quantity*getProduct(productID).getPrice()))
		{
			getProduct(productID).reduceInventory(quantity);
			getCustomer(customerID).processPurchase(quantity*getProduct(productID).getPrice(),getProduct(productID));
			return true;
		}
		return false;
	}
	public boolean takePayment(int customerID, double amount) 
	{
		if(getCustomer(customerID)==null)
			return false;
		getCustomer(customerID).processPayment(amount);
		return true;
	}
	public void outputProducts(Product product) 
	{
		System.out.println("Product Name: "+product.getName());
		System.out.println("Product ID: "+product.getID());
		System.out.println("Description: "+product.getDescription());
		System.out.println("Inventory: "+product.getInventoryCount());
		System.out.println("Number Sold: "+product.getNumberSold());
		System.out.println("Total Paid: "+product.getTotalPaid());
		System.out.println("Price: "+product.getPrice());
	}
	public void outputCustomers(Customer customer) 
	{
		System.out.println("Customer Name: "+customer.getName());
		System.out.println("Customer ID: "+customer.getID());
		System.out.println("Has Credit: "+customer.getCredit());
		System.out.println("Balance: "+customer.getBalance());
		System.out.println("Products Purchased --");
		customer.outputRecentPurchases();
	}
}

