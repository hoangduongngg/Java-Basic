package Xau_nhi_phan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J01022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <String> a = new ArrayList<>();
        a.add("0"); a.add("1");
        //qua gioi han bo nho
        for (int i = 2; i<40; i++) {
            a.add(a.get(i-2) + a.get(i-1));
        }
        
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            String temp = a.get(n-1);
            System.out.println(temp.charAt(k-1));
        }
    }
}
