/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class NhanVien implements Serializable {

    private String maNV;
    private String hoTen;
    private String ngoaiNgu;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String ngoaiNgu, int tuoi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngoaiNgu = ngoaiNgu;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTuoiLaoDong() {
        if (tuoi < 18) {
            return "Chưa trưởng thành";
        } else if (tuoi < 40) {
            return "Tuổi trẻ";

        } else if (tuoi < 60) {
            return "Tuổi sắp về hưu";

        } else {
            return "Tuổi già";
        }
    }

}
