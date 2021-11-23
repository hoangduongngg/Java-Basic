/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03004_chuanhoa_xaukytu_1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author hoangduongngg
 */
public class J03004_ChuanHoa_XauKyTu_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s = in.nextLine();
            System.out.println(ChuanHoa(s));
        }
    }
    public static String ChuanHoa (String s) {
        StringBuffer res = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i=1; i<tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
