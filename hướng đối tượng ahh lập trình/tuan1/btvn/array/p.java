package array;
import java.util.Random;
import java.util.Scanner;
public class p
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
        double sum = 0;
        for (int num : a) {
            sum += num;
        }
        System.out.println("Average: " + (sum / a.length));
    }
}