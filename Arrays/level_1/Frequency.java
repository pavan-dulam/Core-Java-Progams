package level_1;
import java.util.Scanner;

//Given an array, a[], and an element x, find a number of occurrences of x in a[].
public class Frequency {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scanner.nextInt();
        System.out.println("enter elements of array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("enter x:");
        int x=scanner.nextInt();
        int fq=frequency(arr,x);
        System.out.println("Frequency:"+fq);

        scanner.close();
    }

    private static int frequency(int[] arr, int x) {
        int frequencyCount=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x){
                frequencyCount++;
            }
        }
        return frequencyCount;
    }
}
