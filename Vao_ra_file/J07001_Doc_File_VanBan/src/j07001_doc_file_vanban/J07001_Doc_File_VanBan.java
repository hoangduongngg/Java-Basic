package j07001_doc_file_vanban;

import java.io.*;
import java.util.*;

/**
 *
 * @author hoangduongngg
 */
public class J07001_Doc_File_VanBan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}