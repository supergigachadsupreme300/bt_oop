import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Nuoc nuoc = new Nuoc("", "", 0, 0.0f, 0.0f); // Initialize with default values
        System.out.println("Nhap thong tin nuoc:");
        nuoc.nhap();
        System.out.println("\nThong tin nuoc:");
        nuoc.xuat();
        System.out.println("Thanh tien: " + nuoc.ThanhTien());
    }
}