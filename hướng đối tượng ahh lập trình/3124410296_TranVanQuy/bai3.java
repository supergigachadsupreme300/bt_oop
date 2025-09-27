import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int a[]=new int[15];
        int arraySize=a.length;
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
            System.out.println("Menu:");
            System.out.println("1.g");
            System.out.println("2.h");
            System.out.println("3.i");
            System.out.println("4.j");
            System.out.println("5.k");
            System.out.println("6.l");
            System.out.println("7.m");
            System.out.println("8.n");
            System.out.println("9.o");
            System.out.println("10.p");
            System.out.println("0. Exit");
            System.out.print("chon chuc nang: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:g();break;
                case 2:h();break;
                case 3:i();break;
                case 4:j(a);break;
                case 5:k(a);break;
                case 6:l(a);break;
                case 7:m(a);break;
                case 8:n(a);break;
                case 9:o(a);break;
                case 10:p(a);break;
                default:System.out.println("khong ton tai chuc nang do");
            }
            System.out.println();
    }
    public static void g(){
        System.out.print("Nhap N:");
        Scanner scan = new Scanner(System.in);
        int S1=0;
        int n = scan.nextInt();
        for( int i=0;i<=n;i++){
            S1+=i;
        }
        System.out.print("\nS1:");
        float S2=0;
        for( int i=1;i<=n;i++){
            S2+=1/i;
        }
    }
    public static void h(){
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
    public static void i(){
        Scanner scan = new Scanner(System.in);
        System.out.print("vui long nhap x:");
        int x = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i; // Cộng các ước
            }
        }
        if(sum==x){
            System.out.print("day la so hoan thien");
        }
        else{
            System.out.print("day khong phai so hoan thien");
        }
    }
    public static void j(int a[]){
        int s,total=0,x = 0;
        int arraySize=a.length;
        for(int i = 0;i<arraySize;i++){
            s=a[i];
            while(s!=0){
                x+=s%10;
                s/=10;
            }
            if(x%2==0){
                System.out.print(a[i]+" ");
                total++; 
            }
        }
        System.out.println("so chan trong mang:"+total);
    }
    public static void k(int a[]){
       for (int i = 0; i <= a.length - 3; i++) {
            System.out.print("[");
            for (int j = i; j < i + 3; j++) {
                System.out.print(a[j]);
                if (j < i + 2) System.out.print(", ");
            }
            System.out.println("]");
        } 
    }
    public static void l(int a[]){
        int arraySize=a.length;
        System.out.println("\ngiam dan");
        abubblesort(a);
        for(int i=0;i<arraySize;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\ntang dan ");
        bbubblesort(a);
        for(int i=0;i<arraySize;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void abubblesort(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void bbubblesort(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void m(int a[]){
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) count++;
        }
        int[] result = new int[a.length + count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            result[index++] = a[i];
            if (i < a.length - 1 && a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                result[index++] = a[i] + a[i + 1];
            }
        }
    }
    public static void n(int a[]){
        int even = 0, odd = 0;
        for (int num : a) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("so chan: " + even);
        System.out.println("so le: " + odd);
    }
    public static void o(int a[]){
        int max = a[0], min = a[0];
        for (int num : a) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    public static void p(int a[]){
        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("TBC: " + (sum / a.length));
    }
}