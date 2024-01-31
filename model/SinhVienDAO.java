/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class SinhVienDAO implements Serializable{
    public static List<SinhVien> ls = new ArrayList<>();
    private String tenFile;
    
    
    public SinhVienDAO() {
        this.tenFile = "";
    }

    public static List<SinhVien> getLs() {
        return ls;
    }

    public static void setLs(List<SinhVien> ls) {
        SinhVienDAO.ls = ls;
    }
    
    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }
    
    public int plus(SinhVien sv){
        ls.add(sv);
        return 1;
    }
    public List<SinhVien> getAllSinhVien(){
        return ls;
    }
    public int delSinhVienDao(String ma){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equals(ma)){
                ls.remove(sv);
                return 1;
            }
        }
        return -1;
    }
    public SinhVien getSinhVienByID(String id){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equalsIgnoreCase(id)){
                return sv;
            }
        }
        return null;
    }
    public int updateSinhVienDao(SinhVien svNew){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equalsIgnoreCase(svNew.getMaSV())){
                sv.setTenSV(svNew.getTenSV());
                sv.setNgaySinh(svNew.getNgaySinh());
                sv.setGioiTinh(svNew.isGioiTinh());
                sv.setDiaChi(svNew.getDiaChi());
                sv.setHinhAnh(svNew.getHinhAnh());
                return 1;
            }
        }
        return -1;
    }

    public Object setLs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
