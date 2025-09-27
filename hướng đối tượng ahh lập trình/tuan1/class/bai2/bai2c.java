import java.util.Scanner;
public class bai2c{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a[]= {3,6,2,4,7};
        int arraySize=5;
        System.out.println("nhap 3 phan tu");
        int n=3;
        int copy[]=new int [arraySize];
        for(int i=0;i<arraySize;i++){
            copy[i]=a[i];
        }
        
        a= new int [arraySize+3];
        for (int i = 0; i < arraySize; i++) {
            a[i]=copy[i];
        }
        for(int i=0;i<3;i++){
            a[i+arraySize]=scan.nextInt();
        }
        arraySize+=n;
        for (int i = 0; i < arraySize; i++) {
            System.out.print(a[i]+" ");
        }
    }
}