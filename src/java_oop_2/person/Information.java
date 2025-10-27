package java_oop_2.person;

public class Information {

        public void displayInfo() {
            Person p = new Person("Nguyen Thanh Thao", 21, "Nu", "Lang Son", "0327018425");
            System.out.println("== Thông tin đầy đủ ==");
            System.out.println("Tên: " + p.name);
            System.out.println("Tuổi: " + p.age);
            System.out.println("Giới tính: " + p.gender);
            System.out.println("Địa chỉ: " + p.address);
            System.out.println("Số điện thoại: " + p.phone);
        }

    public static void main(String[] args) {
        Information information = new Information();
        information.displayInfo();
    }

}
