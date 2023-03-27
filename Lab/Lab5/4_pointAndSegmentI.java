class Point {
    // Declaring member variables here
	private double x;
    private double y;

    public Point(double x, double y) {
        // please write your code here
        this.x = x;
		this.y = y;
    }

    public double getX() {
        // please write your code here
        return x;
    }

    public double getY() {
        // please write your code here
        return y;
    }

    public double getDistance(Point p) {
        // please write your code here
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
