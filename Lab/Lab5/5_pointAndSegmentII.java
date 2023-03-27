class Point {
    // Same as previous question
  private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double getDistance(Point p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class Line {
    // Declaring member variables here
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        // please write your code here
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Point p) {
        // please write your code here
        this.p1 = new Point(0, 0);
        this.p2 = p;
    }

    public double getLength() {
        // please write your code here
      return this.p1.getDistance(this.p2);
    }

    public Point getIntersection(Line l) {
        // please write your code here
      double x1 = this.p1.getX();
        double y1 = this.p1.getY();
        double x2 = this.p2.getX();
        double y2 = this.p2.getY();
        double x3 = l.p1.getX();
        double y3 = l.p1.getY();
        double x4 = l.p2.getX();
        double y4 = l.p2.getY();
        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        double x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
        double y = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;
        return new Point(x, y);
    }
}
// 建立兩個Point實例
Point p1 = new Point(0.0, 0.0);
Point p2 = new Point(3.0, 4.0);
Point p3 = new Point(3.0, 0.0);
Point p4 = new Point(0.0, 4.0);

// 建立兩個Line實例
Line line1 = new Line(p1, p2);
Line line2 = new Line(p3, p4);

// 使用getLength()方法取得線段的長度
System.out.println("Line1 的長度: " + line1.getLength());
System.out.println("Line2 的長度: " + line2.getLength());

// 使用getIntersection()方法取得兩線段的交點
Point intersection = line1.getIntersection(line2);
System.out.println("Line1 和 Line2 的交點: (" + intersection.getX() + ", " + intersection.getY() + ")");

/* 上述程式碼執行結果如下:
Line1 的長度: 5.0
Line2 的長度: 5.0
Line1 和 Line2 的交點: (1.5, 2.0)
 */
