package J01013_Tong_uoc_so;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class J01013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 0;
        
        //khoi tap mang a[] luu res
        int MAX = (int)(2*Math.pow(10, 6));
        long[] a = new long[MAX+5];
        for (int i=2; i<=MAX; i++) {
            if (a[i]==0) {
                a[i]=i;
                for (int j=2; j<=MAX/i; j++) {
                    if (a[j]!=0) a[i*j] = a[i]+a[j];
                }
            }
        }
        
        while (n-->0) {
            int num = in.nextInt();
            res+=a[num];
        }
        System.out.print(res);
    }
}
