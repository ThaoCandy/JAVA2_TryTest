1.	Xây dựng lớp NhanVien có các thuộc tính: 
-	manv, hoten, tuoi, ngoaingu.
-	các phương thức set/get để lấy thông tin thuộc tính. Phương thức toString() trả về thông tin.
-	public String getTuoiLaoDong(int tuoi): trả về tuổi lao động dựa trên tuổi:
•	tuoi<18: Chưa trưởng thành
•	tuoi<40: Tuổi trẻ	•	tuoi<60: Tuổi sắp về hưu
•	còn lại: Tuổi già
2.	Xây dựng form như hình:
 	![---HÌNH-----](https://github.com/ThaoCandy/JAVA2_TryTest/assets/147786828/a31469a7-f784-43c5-99fd-5adb57c8110f)
 	
ArrayList< NhanVien >
Mở form:  
•	list có 4 phần tử, hiển thị phần tử cuối lên các TextField. 
•	JTable đã có dữ liệu + JTable chọn dòng tương ứng với phần tử trên các text. 
Khi click lên JTable thì hiển thị phần tử tương ứng lên các TextField. 
Thêm mới + Thoát: 
•	Thêm mới: Xóa trắng dữ liệu tại các Text, và cho phép nhập liệu trên các text 
•	Thoát: Thoát khỏi chương trình.
Ghi: 
•	Kiểm tra rỗng, kiểm tra tuổi là số, tuổi 15-65 
•	Lấy dữ liệu trên form để thêm 1 phần tử: Save vào ArrayList, Save vào JTable 
•	Ghi ArrayList< NhanVien > vào file 
Xóa: Xóa phần tử đang chọn trên Table, trong file. 
![image](https://github.com/ThaoCandy/JAVA2_TryTest/assets/147786828/a31469a7-f784-43c5-99fd-5adb57c8110f)
