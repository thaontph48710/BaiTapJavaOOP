package java_oop_2.person;

public class Information {

        public void displayInfo() {
            Person p = new Person("Nguyen Thanh Thao", 22, "Nu", "Lang Son", "0123456789");
            System.out.println("== Thông tin đầy đủ ==");
            System.out.println("Tên: " + p.getName());
            System.out.println("Tuổi: " + p.getAge());
            System.out.println("Giới tính: " + p.getGender());
            System.out.println("Địa chỉ: " + p.getAddress());
            System.out.println("Số điện thoại: " + p.getPhone());
        }

    public static void main(String[] args) {
        Information information = new Information();
        information.displayInfo();
    }

}
