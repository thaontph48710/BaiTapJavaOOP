package java_oop_3.testcase;

import java_oop_3.common.BaseTest;

public class TestCase extends BaseTest {
    String url = "https://crm.anhtester.com/admin/authentication";
    String email;
    String password;

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public TestCase(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void Login() {
        createDriver();
        System.out.println("Truy cập vào đường link: " + url);
        System.out.println("Verify đường link URL hiển thị đúng " + url);
        System.out.println("Verify header đúng là 'Login'");
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập password: " + password);
        System.out.println("Click button Login");
        System.out.println("Kiểm tra kết quả");
        System.out.println("Đăng nhập thành công và hiển thị trang Dashboard");
        closeDriver();
    }


    public void AddCategory() {
        createDriver();
        System.out.println("Truy cập vào đường link: " + url);
        System.out.println("Verify đường link URL hiển thị đúng " + url);
        System.out.println("Verify header đúng là 'Login'");
        System.out.println("Nhập email: " + email);
        System.out.println("Nhập password: " + password);
        System.out.println("Click button Login");
        System.out.println("Kiểm tra kết quả");
        System.out.println("Đăng nhập thành công và hiển thị trang Dashboard");
        System.out.println("Truy cập vào trang Customers");
        System.out.println("Verify đúng title là Customers Summary");
        System.out.println("Verify đúng đường link = 'https://crm.anhtester.com/admin/clients'");
        System.out.println("Nhấn button New Customer");
        System.out.println("Verify đúng  title Customer Details");
        System.out.println("Verify nhập đúng thông tin hợp lệ và đầy đủ các trường");
        System.out.println("Nhấn button Save");
        System.out.println("Verify thêm mới thành công và hiển thị thông báo 'Customer add successfully'");
        System.out.println("Truy cập vào trang Customers");
        System.out.println("Verify đúng title là Customers Summary");
        System.out.println("Verify đúng đường link = 'https://crm.anhtester.com/admin/clients'");
        System.out.println("Nhập tìm kiếm Customer mới them thành công");
        System.out.println("Verify kiểm tra xem Customer mới thêm hiển thị trên danh sách Customers Summary");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCase tc = new TestCase("admin@example.com", "123456");
        tc.Login();

        System.out.println("====================================================");
        tc.AddCategory();
    }

}
