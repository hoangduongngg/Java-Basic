package J01007_Kiem_tra_so_Fibonacci;

/**
 *
 * @author hoangduongngg
 */
public class Fibonacci {
    public static boolean Check(long n) {
        if (n<0) return false;
        if (n==0 || n==1) return true;
        long f0=0;
        long f1=1;
        for (long i=2; i<n; i++) {
            if (n==f0+f1) return true;
            else if (n<f0+f1) return false;
            else {
                long temp=f1;
                f1=f0+f1;
                f0=temp;
                
            }
        }
        return true;
    }
}
