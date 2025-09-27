import java.util.Scanner;
public class h
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap a:");
        int a = scan.nextInt();
        System.out.print("nhap b:");
        int b = scan.nextInt();
        System.out.print("nhap c:");
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("khong hop le");
        } else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep: x = " + x);
            } else {
                System.out.println("phuong trinh vo nghiem trong tap so thuc");
            }
        }
    }
}