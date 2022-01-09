/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuanhoa_sapxep;

import java.util.StringTokenizer;

/**
 *
 * @author hoangduongngg
 */
public class DanhSach implements Comparable<DanhSach>{
    private String HoTen, Ten;

    public DanhSach(String HoTen) {
        this.HoTen = ChuanHoa(HoTen);
        this.Ten = xuly_Ten(HoTen);
    }

    private String xuly_Ten (String HoTen) {
        String[] str = ChuanHoa(HoTen).split(" ");
        int n = str.length;
        return str[n-1];
    }
    
    private String ChuanHoa(String s) {
        StringBuilder res = new StringBuilder();
        StringTokenizer str = new StringTokenizer(s);
        
        while(str.hasMoreTokens()) {
            String tmp = str.nextToken();
            res.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i=1; i<tmp.length(); i++) {
                res.append(Character.toLowerCase(tmp.charAt(i)));
            }
            res.append(" ");
            
        }
        return res+"";
    }

    @Override
    public String toString() {
        return  HoTen ;
    }

    @Override
    public int compareTo(DanhSach o) {
        int x = this.Ten.compareTo(o.Ten);
        if (x!=0) return x;
        return this.HoTen.compareTo(o.HoTen);
    }
}
