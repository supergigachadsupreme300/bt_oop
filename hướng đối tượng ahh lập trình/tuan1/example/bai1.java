import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        float r, cv, dt;

        Scanner scan=new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        r = scan.nextFloat();

        cv = (float)Math.PI*r*2;
        dt= (float)Math.PI*r*r;

        System.out.println("chu vi: " + cv);
        System.out.println("dien tich: " + dt);
    }
}
