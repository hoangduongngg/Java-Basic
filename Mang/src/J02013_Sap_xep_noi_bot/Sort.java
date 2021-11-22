package J02013_Sap_xep_noi_bot;

/**
 *
 * @author hoangduongngg
 */
public class Sort {
    public static void Noi_bot(int n, int a[]) {
        int flag=0;  //bien co: da sort xong
        for (int i=1; i<n; i++) {
            for (int j=0; j<n-1; j++) {
                if (a[j]>a[j+1]) {
                    flag = 1;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            if (flag == 1) {
                flag=0;
                
                System.out.print("Buoc " + i + ": ");
                for (int k=0; k<n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
            else break;
        }
    }
}
