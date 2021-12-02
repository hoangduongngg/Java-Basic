//Idea: phan tich cac so duoi dang nguyen to: 2^a.(b số
package J01012_Uoc_so_chia_het_cho_2;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J01012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while (t-->0) {
            int n = in.nextInt();
            System.out.println(So_uoc_chan.Res(n));
        }
    }
}
