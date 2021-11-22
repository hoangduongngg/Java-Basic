package So_nguyen_to_nho_nhat;
import java.io.*;
import java.util.*;

public class So_nguyen_to_nho_nhat {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] a= new int[10001];
        Arrays.fill(a, 1);
        a[0]=0;a[1]=0;
        for(int i=2;i<10001;i++){
            for(int j=i+i;j<10001;j+=i)
                a[j]=0;
        }
        ObjectInputStream cin= new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> x= (ArrayList<Integer>)cin.readObject();
        int[] snt = new int[10001];
        for(Integer i:x)
            if(a[i]==1)
                snt[i]++;
        for(int i=0;i<10001;i++)
            if(snt[i]>0)
                System.out.println(i+" "+snt[i]);
    }
}