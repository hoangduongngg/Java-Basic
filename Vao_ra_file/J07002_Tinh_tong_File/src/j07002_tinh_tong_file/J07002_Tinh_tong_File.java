package j07002_tinh_tong_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J07002_Tinh_tong_File {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner (new File("DATA.in"));
        long sum;
        sum = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            sum += tinhtong(words);
        }
        System.out.println(sum);
    }
    
    public static Integer tinhtong (String[] worlds) {
        Integer res = 0;
        for (String x : worlds) {
            try {
                res += Integer.parseInt(x);
            } catch (NumberFormatException e) {
            }
        }
        return res;
    }
}
