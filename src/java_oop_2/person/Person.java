package java_oop_2.person;

public class Person {

    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    // Constructor
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    // Getter cho các thuộc tính cần hiển thị bên ngoài
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    String getAddress() {
        return address;
    }

    String getPhone() {
        return phone;
    }

}
