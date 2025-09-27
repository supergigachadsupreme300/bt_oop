import java.util.Random;
import java.util.Scanner;
public class bai2e{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int arraySize=15;
        int a[]= new int[arraySize];
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
        boolean notfound=true;
        System.out.print("Nhap x:");
        int x= scan.nextInt();
        for(int i=0;i<arraySize;i++){
            if(a[i]==x){System.out.println("Vi tri:" + i);notfound=false;}
        }
        if(notfound) System.out.println("khong co x trong mang");
    }
}