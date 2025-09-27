
public class main {
    public static void main(String[] args) {
        marathon runner = new marathon();
        runner.nhap(); // Input runner data
        System.out.println("\n--- Thong tin thi sinh ---");
        runner.xuat(); // Output runner data
        System.out.println("\n--- Thanh tich ---");
        marathon.thoigian result = runner.thanhtich();
        System.out.println("Thoi gian hoan thanh: " + result.Gio + " Gio " + result.phut + " Phut " + result.giay + " Giay");
        System.out.println("\n--- Kiem tra hop le ---");
        runner.kiemtra(); // Validate times
    }
}