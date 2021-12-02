package J02032_Sap_xep_noi_bot_liet_ke_nguoc;


import java.util.ArrayList;


/**
 *
 * @author hoangduongngg
 */
public class Sort {
    public static void Noi_bot_liet_ke_nguoc(int n, int a[]) {
        ArrayList<Integer[]> list = new ArrayList<>();
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
                
//                System.out.print("Buoc " + i + ": ");
//                for (int k=0; k<n; k++) {
//                    System.out.print(a[k] + " ");
//                }
//                System.out.println();
                    //dang can sua tai day: idea: cho array vao list roi in nguoc lai
                  list.add(new Integer[]{1, 2, 3});
            }
            else break;
        }
        System.out.println(list);
    }
}
