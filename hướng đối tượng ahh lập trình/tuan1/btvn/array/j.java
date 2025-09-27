package array;
import java.util.Random;
import java.util.Scanner;
public class j
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
        int s,total=0,x = 0;
        System.out.println( " ");
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
}