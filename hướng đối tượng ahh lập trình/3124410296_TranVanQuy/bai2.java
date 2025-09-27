import java.util.Random;
import java.util.Scanner;
public class bai2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap phim so de chon chuc nang(1-4)"); 
        System.out.println("1:nhap ca gia tri cho mang a, xuat mang.");
        System.out.println("2:sinh cac gia tri ngau nhien <100 cho a.xuat mang");
        System.out.println("3:them vao a phan tu nhap tu ban phim");
        System.out.println("4:xoa cac so la boi so cua 5 trong a");
        System.out.println("5:tim trong a co chua so x khong? voi x nhap tu ban phim");
        System.out.println("6:xuat cac phan co chu so hang chuc la 1 trong a");
        int n = scan.nextInt();
        int a[]={2,5,12,4};
        switch(n){
            case 1:bai2a(a);break;
            case 2:bai2b(a);break;
            case 3:bai2c(a);break;
            case 4:bai2d(a);break;
            case 5:bai2e(a);break;
            case 6:bai2f(a);break;
            default:System.out.println("chuc nang khong ton tai");
        }
        
        
    }
    public static void bai2a(int a[]){
            Scanner scan = new Scanner(System.in);
            int arraySize=a.length;
            for(int i=0;i<arraySize;i++){
                System.out.print(a[i]);
            }
            System.out.println("nhap gia tri moi cho mang");
            for(int i=arraySize;i<arraySize;i++){
                a[i]=scan.nextInt();
            }
            System.out.println("\n");
            for(int i=0;i<arraySize;i++){
                System.out.print(a[i]);
            }
    }
        
    public static void bai2b(int a[]){
        Random random = new Random();
        int arraySize=a.length;
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
    }
    public static void bai2c(int a[]){
                Scanner scan = new Scanner(System.in);
                int arraySize=a.length;
                System.out.print("nhap so phan tu muon them:");
                int n= scan.nextInt();
                int copy[]=new int [arraySize];
                for(int i=0;i<arraySize;i++){
                    copy[i]=a[i];
                }
                
                a = new int [arraySize+n];
                for (int i = 0; i < arraySize; i++) {
                    a[i]=copy[i];
                }
                for(int i=0;i<3;i++){
                    a[i+arraySize]=scan.nextInt();
                }
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]+" ");
                }
            }
            
    public static void bai2d(int a[]){
                int arraySize=a.length;
                int boiso=0,copy[]=new int [arraySize];
                for(int i=0;i<arraySize;i++){
                    System.out.print(a[i]+ " ");
                    if(a[i]%5==0||a[i]==0){boiso++;continue;} 
                    copy[i-boiso]=a[i];
                }
                arraySize-=boiso;
                a=new int [arraySize];
                System.out.println(" ");
                for (int i = 0; i < arraySize; i++) {
                    a[i]=copy[i];
                    System.out.print(a[i]+ " ");
                }
            }
        public static void bai2e(int a[]){
                Scanner scan = new Scanner(System.in);
                int arraySize=a.length;
                boolean notfound=true;
                System.out.print("Nhap x:");
                int x= scan.nextInt();
                for(int i=0;i<arraySize;i++){
                    if(a[i]==x){System.out.println("Vi tri:" + i);notfound=false;}
                }
                if(notfound) System.out.println("khong co x trong mang");
            }
        public static void bai2f(int a[]){
                int arraySize=a.length;
                for(int i=0;i<arraySize;i++){
                    if(a[i]/10==1) System.out.println("Vi tri "+i+": "+a[i]); 
                }
            }
    }