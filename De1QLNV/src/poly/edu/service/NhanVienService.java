/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import poly.edu.model.NhanVien;

/**
 *
 * @author user
 */
public class NhanVienService {

    public ArrayList<NhanVien> list = new ArrayList<>();

    public NhanVienService() {
    }

    public void fakedate() {
        list.add(new NhanVien("NV01", "Nguyen Thu Thao", "Anh", 24));
        list.add(new NhanVien("NV02", "Nguyen Thu Trang", "Pháp", 19));
        list.add(new NhanVien("NV03", "Nguyen Thi Lan", "Nhật", 35));
        list.add(new NhanVien("NV04", "Nguyen Van Huynh", "Hàn", 50));

    }

    public boolean Open(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            list = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean Save(String path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(list);
            oos.flush();
            oos.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
