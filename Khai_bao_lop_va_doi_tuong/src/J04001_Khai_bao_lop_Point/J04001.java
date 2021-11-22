package J04001_Khai_bao_lop_Point;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            Point p1 = new Point (in.nextDouble(), in.nextDouble());
            Point p2 = new Point (in.nextDouble(), in.nextDouble());
            System.out.println(String.format("%.4f", p1.distance(p2)));
        }
    }
}