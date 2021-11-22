package ds_doanhngiep;

import java.util.*;
import java.io.*;

/**
 *
 * @author hoangduongngg
 */
public class DS_DoanhNgiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File ("DN.in"));
        Integer t = Integer.parseInt(in.nextLine());
        HashMap <String, DoanhNghiep> map = new HashMap<>();
        while (t-->0) {
            DoanhNghiep dn = new DoanhNghiep(in.nextLine(), in.nextLine(), in.nextLine());
            map.put(dn.getMa(), dn);
        }
        xuly(map);
    }
    
    public static void xuly(HashMap <String, DoanhNghiep> map) {
        List keys = new LinkedList<>(map.keySet());
        Collections.sort(keys);
        
        for (Object x: keys) {
            System.out.println(map.get(x));
        }
    }
}
