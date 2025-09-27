import java.util.Random;
public class bai2d{
    public static void main(String[] args){
        Random random = new Random();
        int arraySize=15;
        int a[]= new int[arraySize];
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
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
}