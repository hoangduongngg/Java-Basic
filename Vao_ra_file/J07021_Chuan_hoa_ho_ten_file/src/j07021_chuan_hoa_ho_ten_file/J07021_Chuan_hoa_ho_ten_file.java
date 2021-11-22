package j07021_chuan_hoa_ho_ten_file;

import java.util.*;
import java.io.*;

public class J07021_Chuan_hoa_ho_ten_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        boolean check =true;
        while(check){
            String s = in.nextLine();
            if(s.equals("END"))
                check = false;
            else{
                System.out.println(ChuanHoa(s));
            }
        }
    }
    public static String ChuanHoa (String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String tmp = st.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i=1; i<tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
        }
        return "" + res;

    }
    //Cach cua Tri
    //    public static void ChuanHoa (String s) {
//        StringBuilder res = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(s);
//        while(st.hasMoreTokens()){
//            String tmp = st.nextToken();
//            res.append(Character.toUpperCase(tmp.charAt(0)));
//            for(int i=1; i<tmp.length(); i++)
//                res.append(Character.toLowerCase(tmp.charAt(i)));
//                res.append(" ");
//            }
//        //System.out.println(res);
//        System.out.println(res.toString().trim());
//    }
}