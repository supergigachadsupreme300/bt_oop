import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private static String college = "HUFI";

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    // Hàm khởi tạo không tham số
    public Student() {
        id = 0;
        name = "Nguyen Van An";
    }

    // Hàm khởi tạo có tham số
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Hàm khởi tạo sao chép
    public Student(Student s) {
        id = s.id;
        name = s.name;
    }

    // Hàm nhập thông tin
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Xóa bộ đệm
        System.out.println("Moi nhap ho ten: ");
        name = sc.nextLine();
    }

    // Hàm xuất thông tin
    public void xuat() {
        System.out.println("id: " + id + " - " + "name: " + name + " college: " + college);
    }

    // Hàm thay đổi tên trường
    private static void thayDoiTruong(String college) {
        Student.college = college;
    }
}