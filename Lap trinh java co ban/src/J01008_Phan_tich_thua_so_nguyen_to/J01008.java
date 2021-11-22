package J01008_Phan_tich_thua_so_nguyen_to;

import java.util.*;
public class J01008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 1;
        while (t-->0) {
            int n = in.nextInt();
            System.out.print("Test " + k + ": ");
            k++;
            Phan_tich.SNT(n);
        }
    }
}