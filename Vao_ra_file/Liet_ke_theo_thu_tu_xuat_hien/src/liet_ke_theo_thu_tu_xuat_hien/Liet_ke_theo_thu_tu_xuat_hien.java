package liet_ke_theo_thu_tu_xuat_hien;

import java.io.*;
import java.util.*;

public class Liet_ke_theo_thu_tu_xuat_hien {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in_NP = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        //Luu cac tu trong nhiphan vao 
        ArrayList <String> ListString_NP =  (ArrayList<String>) in_NP.readObject();
        Set <String> word_NP = new HashSet<>();
        for (String s:ListString_NP) {
            String[] tmp = s.toLowerCase().split("\\s+");
            for (String s1:tmp) word_NP.add(s1);
        }
        //Luu cac tu khac nhau trong vanban vao List -> theo thu tu
        Scanner in_VB = new Scanner(new File ("VANBAN.in"));
        List <String> lists = new ArrayList<>();
        Set <String> word_VB = new TreeSet<>();
        while (in_VB.hasNext()) {
            String x = in_VB.next().toLowerCase();
            if (!word_VB.contains(x)) {
                word_VB.add(x);
                lists.add(x);
            }
        }
        
        for (String s:lists)
            if (word_NP.contains(s))
                System.out.println(s);
    }
}