package J04009_Dien_tich_tam_giac;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            Point p1 = new Point (in.nextDouble(), in.nextDouble());
            Point p2 = new Point (in.nextDouble(), in.nextDouble());
            Point p3 = new Point (in.nextDouble(), in.nextDouble());
            Dien_tich_tam_giac S = new Dien_tich_tam_giac(p1, p2, p3);
            System.out.println(S);
        }
    }
}