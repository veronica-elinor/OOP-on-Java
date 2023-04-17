class Dog extends Animal { 
    // write your code here
  private final String breed;
  
  public Dog (String name, String breed){
    super(name);
    this.breed=breed;
  }
  
  public String getBreed() {
    return breed;
  }
  
  public void makeSound() {
    System.out.println("Woof");
  }
}

class Cat extends Animal {
	// write your code here
  private final boolean isDomestic;
  
  public Cat(String name, boolean isDomestic) {
    super(name);
    this.isDomestic=isDomestic;
  }
  
  public boolean getIsDomestic() {
  	return isDomestic;
  }
  public void makeSound() {
    System.out.println("Meow");
  }
}
