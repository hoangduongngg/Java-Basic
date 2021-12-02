/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J03004_Chuan_hoa_xau_ho_ten_1;

/**
 *
 * @author hoangduongngg
 */
public class ChuanHoa {
    private String s;
    public ChuanHoa() { 
    }
    public ChuanHoa(String s) {
        this.s = s;
    }
    private String xuly_xau(String s) {
        String[] tu = s.split("\\s");
        String res = "";
        for (String x:tu) {
            res+=x+" ";
        }
        return res;
    }

    
    @Override
    public String toString() {
        return s;
    }
    
}
