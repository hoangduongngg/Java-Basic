package J01008_Phan_tich_thua_so_nguyen_to;

public class Phan_tich {
    public static void SNT (int n) {
        int count=0;
        if (n>1) {
            if (n%2==0) {
            while (n%2==0) {
                count++;
                n/=2;
            }
            System.out.print("2("+count+") ");
            }
            for (int i=3; i<=n; i+=2) {
                if (n%i==0) {
                    count=0;
                    while (n%i==0) {
                        count++;
                        n/=i;
                    }
                    System.out.print(i+"("+count+") ");
                }  
            }
        }
        System.out.println();
    }
}