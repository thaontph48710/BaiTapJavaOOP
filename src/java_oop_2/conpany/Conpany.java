package java_oop_2.conpany;

import java_oop_2.person.Person;

public class Conpany {
    public void displayInfo() {
        Person p = new Person("Nguyen Thanh Thao", 22, "Nu", "Lang Son", "0123456789");
        System.out.println("== Thông tin đầy đủ ==");
        System.out.println("Tên: " + p.getName());
        System.out.println("Tuổi: " + p.getAge());
        System.out.println("Giới tính: " + p.getGender());
    }

    public static void main(String[] args) {
        Conpany c = new Conpany();
        c.displayInfo();
    }
}
