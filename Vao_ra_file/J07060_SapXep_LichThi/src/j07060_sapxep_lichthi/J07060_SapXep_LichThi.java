/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07060_sapxep_lichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07060_SapXep_LichThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONTHI.in"));
        int t;
        t = Integer.parseInt(in.nextLine());
        ArrayList<MonThi> dsmt = new ArrayList<>();
        while (t-->0) {
            dsmt.add(new MonThi(in.nextLine(),in.nextLine(), in.nextLine()));
        }
        
        in = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(in.nextLine());
        int stt=0;
        ArrayList<CaThi> dsct = new ArrayList<>();
        while (t-->0) {
            stt++;
            dsct.add(new CaThi(stt, in.nextLine(),in.nextLine(), in.nextLine()));
        }
        
        in = new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(in.nextLine());
        ArrayList<LichThi> dslt = new ArrayList<>();
        while (t-->0) {
            String[] str = in.nextLine().split(" ");
            CaThi caThi = new CaThi();
            MonThi monThi = new MonThi();
            for (CaThi ct:dsct) {
                if (str[0].compareTo(ct.getMaCT())==0) {
                    caThi = ct;
                    break;
                }
            }
            for (MonThi mt:dsmt) {
                if (str[1].compareTo(mt.getMaMH())==0) {
                    monThi = mt;
                    break;
                }
            }
            
            dslt.add(new LichThi(caThi, monThi, str[2], str[3]));
        }
        Collections.sort(dslt);
        for (LichThi x:dslt) {
            System.out.println(x);
        }
    }
    
}
