
import java.util.Scanner;
public class bai1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap phim so de chon chuc nang(1-4)"); 
        System.out.println("1:Nhap chieu dai, chieu rong cua HCN. Tinh chu vi, dien tich HCN đo.");
        System.out.println("2:Nhap 3 so nguyen a,b,c. Xuat so max, min cua 3 so đo.");
        System.out.println("3:Nhap vao so nguyen duong n. Xuat cac uoc của n.");
        System.out.println("4:Nhap vao so nguyen duong x. dem so chu so cua x");
        int n = scan.nextInt();
        switch(n){
            case 1:bai1a();break;
            case 2:bai1b();break;
            case 3:bai1c();break;
            case 4:bai1d();break;
            default:System.out.println("chuc nang khong ton tai");
        }
    }
    public static void bai1a (){
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        int cDai = scan.nextInt();
        System.out.print("nhap chieu rong:");
        int cRong = scan.nextInt();
        System.out.println("Chieu dai:" + cDai);
        System.out.print("Chieu rong:" + cRong);
    }
    public static void bai1b (){
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
    public static void bai1c(){
        System.out.print("nhap n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("uoc của "+ n);
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i + " ");
        }
    }
    public static void bai1d(){
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap so:");
            n = scan.nextInt();
        }while(n==0);
        
        int s=0;
        while(n!=0){
            n/=10;
            s++;
        }
        System.out.println("so chu so:"+s);
    }
}
