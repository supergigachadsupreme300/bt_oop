import java.util.Scanner;
public class bai2a{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap 5 so vao mang");
        int a[]= new int [5];
        for(int i=0;i<5;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("\n");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}