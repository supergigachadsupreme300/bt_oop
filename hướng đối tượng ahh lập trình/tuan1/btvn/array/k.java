package array;
import java.util.Random;
import java.util.Scanner;
public class k
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
        for (int i = 0; i <= a.length - 3; i++) {
            System.out.print("[");
            for (int j = i; j < i + 3; j++) {
                System.out.print(a[j]);
                if (j < i + 2) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}