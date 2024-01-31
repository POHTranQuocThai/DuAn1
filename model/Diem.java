    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class Diem {
    private int id;
    private SinhVien sv;
    private double dToan;
    private double dLi;
    private double dHoa;
    private double tbc;
    private String xepLoai;

    public Diem() {
    }
    
    public Diem(int id, SinhVien sv, double dToan, double dLi, double dHoa, double tbc, String xepLoai) {
        this.id = id;
        this.sv = sv;
        this.dToan = dToan;
        this.dLi = dLi;
        this.dHoa = dHoa;
        this.tbc = tbc;
        this.xepLoai = xepLoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public double getdToan() {
        return dToan;
    }

    public void setdToan(double dToan) {
        this.dToan = dToan;
    }

    public double getdLi() {
        return dLi;
    }

    public void setdLi(double dLi) {
        this.dLi = dLi;
    }

    public double getdHoa() {
        return dHoa;
    }

    public void setdHoa(double dHoa) {
        this.dHoa = dHoa;
    }

    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
    public double diemTBC(){
        return (getdToan()+getdLi()+getdHoa())/3;
    }
    public String xepLoai(){
        String xl = "";
        double diemTB = diemTBC();
        if(diemTB>=3.5 && diemTB <6.5){
            xl = "Trung Bình";
        }else if(diemTB >=8){
            xl = "Giỏi";
        }else if(diemTB >=6.5 && diemTB <8){
            xl = "Khá";
        }else {
            xl = "Yếu";
        }
        return xl;
    }
    
    
}
