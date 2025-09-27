import java.util.Scanner;

public class bai1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap 3 so");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max,min;
        if(a>b&&a>c){
            max = a;
        }
        else if (b>a&&b>c) max = b;
        else max=c;
        if(a<b&&a<c){
            min = a;
        }
        else if (b<a&&b<c) min = b;
        else min=c;
        System.out.println("max:"+max);
        System.out.println("min"+min);
    }
}
