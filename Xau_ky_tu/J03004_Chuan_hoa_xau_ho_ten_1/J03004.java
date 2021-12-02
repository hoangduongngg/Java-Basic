/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03004_Chuan_hoa_xau_ho_ten_1;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J03004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            ChuanHoa s = new ChuanHoa(in.next());
            System.out.println(s);
        }
    }
}
