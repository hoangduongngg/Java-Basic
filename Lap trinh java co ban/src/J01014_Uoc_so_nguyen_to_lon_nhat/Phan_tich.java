package J01014_Uoc_so_nguyen_to_lon_nhat;

public class Phan_tich {
    public static long Uoc_NT_Max (long n) {
        long res=1;
        if (n%2==0) {
            res=2;
            while (n%2==0)
                n/=2;
        }
        for (int i=3; i<=Math.sqrt(n); i+=2) {
            if (n%i==0) {
                res=i;
                while (n%i==0)
                    n/=i;
            }
        }
        if (n>1) return n;
        return res;
    }
}
