package j01022_xau_nhi_phan;

import java.util.Scanner;
public class J01022_Xau_nhi_phan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //mang a luu do dai cua cac xau
        Integer[] a = new Integer[93];
        a[0] = 0 ; a[1] = 1;
        for (int i=2; i<93; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        int t = in.nextInt();
        while (t-->0) {
                int n = in.nextInt();
                long k = in.nextLong();
                if (n>0 && k<=a[n]) {
                    System.out.println(XauNP(n,k, a));
                }
        }
    }
    
    public static int XauNP (int n, long k, Integer[] a) {
        if (n==1) return 0;
        if (n==2) return 1;
        if (k <= a[n-2]) return XauNP(n-2, k, a);
        return XauNP(n-1, k - a[n-2], a);
    }
}
