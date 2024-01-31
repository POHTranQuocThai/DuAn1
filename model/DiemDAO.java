/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class DiemDAO {
    List<Diem> ls = new ArrayList<>();
    public int plus(Diem d){
        ls.add(d);
        return 1;
    }
    public List<Diem> getAllDiemSV(){
        return ls;
    }
    public int delDiemSV(String d){
        Diem diem = getDiemByMaSV(d);
        if(diem != null){
            ls.remove(diem);
            return 1;
        }
       return -1;
    }
    public Diem getDiemByMaSV(String maSV){
        for (Diem d : ls) {
            if(d.getSv().getMaSV().equalsIgnoreCase(maSV))
                return d;         
        }
        return null;
    }
    public int updateDiemSV(Diem diem){
        for (Diem d : ls) {
            if(d.getSv().getMaSV().equalsIgnoreCase(diem.getSv().getMaSV())){
                d.setdToan(diem.getdToan());
                d.setdLi(diem.getdLi());
                d.setdHoa(diem.getdHoa());
                return 1;
            }
        }
        return -1;
    }
    
}
