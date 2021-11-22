package Tinh_luy_thua;

import java.util.Scanner;
/**
 *
 * @author hoangduongngg
 */
public class J01021 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean OK = false;     
        while(!OK) {
            double a =  in.nextDouble();
            double b = in.nextDouble();
            if (a==0 && b==0) {
                OK=true;
            }
            else {
                System.out.println(new LuyThua(a,b));
            }
        }
    }
}
