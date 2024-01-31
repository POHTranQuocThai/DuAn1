/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Tran Quoc Thai - CE181618
 */
public class Tinh implements Serializable{

    public static Tinh getbyID(int quequan) {
        return Tinh.getdsTinh().get(quequan);
        
    }
    private int maTinh;
    private String tenTinh;

    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public String toString() {
        return "Tinh{" + "maTinh=" + maTinh + ", tenTinh=" + tenTinh + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.maTinh;
        hash = 79 * hash + Objects.hashCode(this.tenTinh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tinh other = (Tinh) obj;
        if (this.maTinh != other.maTinh) {
            return false;
        }
        if (!Objects.equals(this.tenTinh, other.tenTinh)) {
            return false;
        }
        return true;
    }
    public static ArrayList<Tinh> getdsTinh(){
        String[] ds = {
                                "Hà Giang",
				"Cao Bằng",
				"Lào Cai",
				"Sơn La",
				"Lai Châu",
				"Bắc Kạn",
				"Lạng Sơn",
				"Tuyên Quang",
				"Yên Bái",
				"Thái Nguyên",
				"Điện Biên",
				"Phú Thọ",
				"Vĩnh Phúc",
				"Bắc Giang",
				"Bắc Ninh",
				"Hà Nội",
				"Quảng Ninh",
				"Hải Dương",
				"Hải Phòng",
				"Hòa Bình",
				"Hưng Yên",
				"Hà Nam",
				"Thái Bình",
				"Nam Định",
				"Ninh Bình",
				"Thanh Hóa",
				"Nghệ An",
				"Hà Tĩnh",
				"Quảng Bình",
				"Quảng Trị",
				"Thừa Thiên Huế",
				"Đà Nẵng",
				"Quảng Nam",
				"Quảng Ngãi",
				"Kon Tum",
				"Gia Lai",
				"Bình Định",
				"Phú Yên",
				"Đắk Lắk",
				"Khánh Hòa",
				"Đắk Nông",
				"Lâm Đồng",
				"Ninh Thuận",
				"Bình Phước",
				"Tây Ninh",
				"Bình Dương",
				"Đồng Nai",
				"Bình Thuận",
				"Thành phố Hồ Chí Minh",
				"Long An",
				"Bà Rịa – Vũng Tàu",
				"Đồng Tháp",
				"An Giang",
				"Tiền Giang",
				"Vĩnh Long",
				"Bến Tre",
				"Cần Thơ",
				"Kiên Giang",
				"Trà Vinh",
				"Hậu Giang",
				"Sóc Trăng",
				"Bạc Liêu",
				"Cà Mau",
	
};
        ArrayList<Tinh> list = new ArrayList<>();
        int i=0;
        for (String tenTinh : ds) {
            Tinh t = new Tinh(i, tenTinh);
            list.add(t);
        }
        return list;
    }
    
}
