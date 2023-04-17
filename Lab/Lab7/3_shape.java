class Oval extends Shape { 
    // write your code here
  private int major;
  private int minor;
  private final double PI = 3.14;

  public Oval(int major, int minor) {
    	this.major=major;
        this.minor=minor;
  		if (major==minor) {
          setName("圓形");
        }
    	else {
          setName("橢圓形");
        }
    	setArea(PI*major*minor);
    	setPerimeter(2*PI*minor+4*(major-minor));
    
  }
	public void showInfo(){
      	System.out.printf("形狀:%s\n", getName());
        System.out.printf("面積:%.2f\n", getArea());
        System.out.printf("周長:%.2f\n", getPerimeter());
    }
}

class Rectangle extends Shape {
	// write your code here
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width=width;
    this.height=height;
    if (width==height) {
      setName("正方形");
    }
    else {
      setName("長方形");
    }
    setArea(width*height);
    setPerimeter(2*(width+height));
  }

	public void showInfo(){
      System.out.printf("形狀:%s\n", getName());
      System.out.printf("面積:%.2f\n", getArea());
      System.out.printf("周長:%.2f\n", getPerimeter());
    }
}
