package array;
import java.util.Random;
import java.util.Scanner;
public class l
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int a[]=new int[15];
        int arraySize=a.length;
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
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
}