class Point {
    // Same as previous question
}

class Line {
    // Declaring member variables here

    public Line(Point p1, Point p2) {
        // please write your code here
    }

    public Line(Point p1) {
        // please write your code here
    }

    public double getLength() {
        // please write your code here
    }

    public Point getIntersection(Line l) {
        // please write your code here
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
