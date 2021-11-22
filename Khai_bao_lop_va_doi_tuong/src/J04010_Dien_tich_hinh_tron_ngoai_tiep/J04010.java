package J04010_Dien_tich_hinh_tron_ngoai_tiep;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J04010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            Point p1 = new Point (in.nextDouble(), in.nextDouble());
            Point p2 = new Point (in.nextDouble(), in.nextDouble());
            Point p3 = new Point (in.nextDouble(), in.nextDouble());
            Dien_tich_hinh_tron_ngoai_tiep S = new Dien_tich_hinh_tron_ngoai_tiep(p1, p2, p3);
            System.out.println(S);
        }
    }
}