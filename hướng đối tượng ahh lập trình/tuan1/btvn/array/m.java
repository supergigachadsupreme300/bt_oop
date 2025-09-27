package array;
import java.util.Random;
import java.util.Scanner;
public class m
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
}