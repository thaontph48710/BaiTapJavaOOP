package java_oop_1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Thảo",21, "Tester", "Phòng Java");
        NhanVien nv1 = new NhanVien("Thuy",33,"Dev","C#");
        nv.hienThiThongTin();
        nv1.hienThiThongTin();
    }
}
