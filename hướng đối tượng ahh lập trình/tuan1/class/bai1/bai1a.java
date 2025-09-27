import java.util.Scanner;
public class bai1a{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        int cDai = scan.nextInt();
        System.out.print("nhap chieu rong:");
        int cRong = scan.nextInt();
        System.out.print("Chieu dai:" + cDai);
        System.out.print("Chieu rong:" + cRong);
    }
}