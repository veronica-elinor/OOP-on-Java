class Oval extends Shape { 
    // write your code here
  private int major;
  private int minor;
  private final int PI = 3.14;

  public Oval(int major, int minor) {
  		if (major==minor) {
          name = "圓形";
        }
    	else {
          name = "橢圓形";
        }
  }
	public showInfo(){
      
}

class Rectangle extends Shape {
	// write your code here
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    if (width==height) {
      name = "正方形";
    }
    else {
      name = "長方形";
    }
  }

	public showInfo(){
      System.out.println("形狀:"+name);
      System.out.println("面積":+area);
      System.out.println("周長"+perimeter);
}
