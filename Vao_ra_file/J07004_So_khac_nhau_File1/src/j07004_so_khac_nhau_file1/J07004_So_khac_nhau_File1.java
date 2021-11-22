package j07004_so_khac_nhau_file1;

import java.io.*;
import java.util.*;
/**
 *
 * @author hoangduongngg
 */
public class J07004_So_khac_nhau_File1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList <Integer> list = new ArrayList<>();
        while (in.hasNext()) {
            Integer n = Integer.parseInt(in.next());
            list.add(n);
        }
        xuly(list);
        
    }
    public static void xuly( ArrayList <Integer> list) {
        Collections.sort(list);
        
        for (int i=0; i<list.size()-1; i++) {
            System.out.print(list.get(i) + " ");
            int dem = 1;
            while(Objects.equals(list.get(i+1), list.get(i))) {
                i++;
                dem++;
                if (i == list.size()-1) break;
            }
            System.out.println(dem);
        }
    }
}