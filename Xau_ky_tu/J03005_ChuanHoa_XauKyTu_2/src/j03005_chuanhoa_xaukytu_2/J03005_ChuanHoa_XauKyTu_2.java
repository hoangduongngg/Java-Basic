/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03005_chuanhoa_xaukytu_2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author hoangduongngg
 */
public class J03005_ChuanHoa_XauKyTu_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s = in.nextLine();
            System.out.println(ChuanHoa_2(ChuanHoa(s)));
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
    
    public static String ChuanHoa_2 (String s) {
        StringBuffer res = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s);
        String lastname = st.nextToken().toUpperCase();
        while (st.hasMoreTokens()) {
            res.append(st.nextToken() + " ");
        }
        res.deleteCharAt(res.length()-1);
        res.append(", " + lastname);
        return res.toString();
    }
}
