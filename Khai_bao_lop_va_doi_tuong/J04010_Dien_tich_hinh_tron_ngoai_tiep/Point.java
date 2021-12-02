package J04010_Dien_tich_hinh_tron_ngoai_tiep;

/**
 *
 * @author hoangduongngg
 */
public class Point {
    private double x, y;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point (Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance (Point sencondPoint) {
        return Math.sqrt( Math.pow(x - sencondPoint.getX(), 2) + Math.pow(y - sencondPoint.getY(), 2));
    }
    public double distance (Point p1, Point p2) {
        return Math.sqrt( Math.pow(p1.getX(), p2.getX())+ Math.pow(p1.getY(), p2.getY()));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
