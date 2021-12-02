        
package J01004_So_nguyen_to;
import java.util.*;
public class J01004_So_nguyen_to {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while (t-->0) {
            int n = in.nextInt();
            if (So_nguyen_to.Check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
