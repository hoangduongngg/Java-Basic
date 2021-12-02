package J04009_Dien_tich_tam_giac;
/**
 *
 * @author hoangduongngg
 */
public class Dien_tich_tam_giac {
    private double a,b,c;
    
    public Dien_tich_tam_giac() {
    }
    public Dien_tich_tam_giac(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p3.distance(p1);
    }
    private double dientich (double a, double b, double c) {
        return Math.sqrt( (a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c) )/4;
    }
    
    @Override
    public String toString() {
        if (a+b>c && a+c>b && b+c>a) {
            return String.format("%.2f", dientich(a, b, c) ); 
        }
        return "INVALID";
    }
}
