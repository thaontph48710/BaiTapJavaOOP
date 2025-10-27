package java_oop_2.conpany;

import java_oop_2.person.Person;

public class Conpany {
    public void displayInfo() {
        Person p = new Person("Nguyen Mai Quỳnh", 24, "Nu", "Lang Son", "0123456789");
        System.out.println("== Thông tin đầy đủ ==");
        System.out.println("Tên: " + p.name);
        System.out.println("Tuổi: " + p.age);
        System.out.println("Giới tính: " + p.gender);

    }

    public static void main(String[] args) {
        Conpany c = new Conpany();
        c.displayInfo();
    }
}
