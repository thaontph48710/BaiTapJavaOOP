package java_oop_1;

public class NhanVien {
    String ten;
    int tuoi;
    String chucVu;
    String phongLamViec;

    public NhanVien(String ten, int tuoi, String chucVu, String phongLamViec) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chucVu = chucVu;
        this.phongLamViec = phongLamViec;
    }
    public void hienThiThongTin(){
        System.out.println("Thông tin nhân viên:");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Phòng làm việc: " + phongLamViec);
    }
}
