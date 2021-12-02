package J01007_Kiem_tra_so_Fibonacci;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while (t-->0) {
            long n = in.nextLong();
            if (Fibonacci.Check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
