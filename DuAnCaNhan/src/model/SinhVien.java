/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String hoVaTen;
    private Tinh queQuan;
    private boolean gioiTinh;
    private Date ngaySinh;
    private float diemTB;
    private String xepLoai;
    private String hinhAnh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoVaTen, Tinh queQuan, boolean gioiTinh, Date ngaySinh, float diemTB, String xepLoai, String hinhAnh) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.xepLoai = xepLoai;
        this.hinhAnh = hinhAnh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Tinh getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(Tinh queQuan) {
        this.queQuan = queQuan;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        if(diemTB>=0 &&diemTB<=10)
        this.diemTB = diemTB;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void getNgaySinh(String format) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", queQuan=" + queQuan + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diemTB=" + diemTB + ", xepLoai=" + xepLoai + ", hinhAnh=" + hinhAnh + '}';
    }
    
    public String xeploai(){
        String xl = "";
        if(getDiemTB()>=8){
            xl = "Giỏi";
        }else if(getDiemTB()>=6.5){
            xl = "Khá";
        }else if(getDiemTB()>=3.5){
            xl = "Trung Bình";
        }else {
            xl = "Yếu";
        }
        return xl;
    }
}
