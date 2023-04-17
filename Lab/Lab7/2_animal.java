class Dog extends Animal { 
    // write your code here
  private final String breed;
  
  public Dog (String name, String breed){
    this.name=name;
    this.breed=breed;
  }
  
  public getBreed() {
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
    this.name=name;
    this.breed=breed;
  }
  
  public void getIsDomestic() {
  	return isDomestic;
  }
  public void makeSound() {
    System.out.println("Meow");
  }
}
