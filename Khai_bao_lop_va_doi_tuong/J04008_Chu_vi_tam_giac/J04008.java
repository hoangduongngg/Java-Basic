package J04008_Chu_vi_tam_giac;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            Point p1 = new Point (in.nextDouble(), in.nextDouble());
            Point p2 = new Point (in.nextDouble(), in.nextDouble());
            Point p3 = new Point (in.nextDouble(), in.nextDouble());
            Chu_vi a = new Chu_vi(p1, p2, p3);
            System.out.println(a);
        }
    }
}