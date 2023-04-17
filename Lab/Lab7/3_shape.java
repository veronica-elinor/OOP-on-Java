class Oval extends Shape// Inherit here { 
    // write your code here
  private int major;
  private int minor;
  private final int PI = 3.14;

  public Oval(int major, int minor) {
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
	}
	protected double getPerimeter() {
		return perimeter;
	}
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}

class Rectangle extends Shape// Inherit here {
	// write your code here
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    

	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
	}
	protected double getPerimeter() {
		return perimeter;
	}
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}
