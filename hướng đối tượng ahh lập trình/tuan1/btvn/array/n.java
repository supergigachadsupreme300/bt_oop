package array;
import java.util.Random;
import java.util.Scanner;
public class n
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
        int even = 0, odd = 0;
        for (int num : a) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}