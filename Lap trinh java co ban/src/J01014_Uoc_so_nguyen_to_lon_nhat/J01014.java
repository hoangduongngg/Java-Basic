package J01014_Uoc_so_nguyen_to_lon_nhat;

import java.util.*;
public class J01014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte t = in.nextByte();
        while (t-->0) {
            long n = in.nextLong();
            System.out.println(Phan_tich.Uoc_NT_Max(n));
        }
        in.close();
    }
}
