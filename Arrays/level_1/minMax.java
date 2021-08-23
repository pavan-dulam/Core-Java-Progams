package level_1;
import java.util.Scanner;
//Given an array, write functions to find the minimum and maximum elements in it. 


public class minMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++)
        {
           arr[i]=scanner.nextInt();  
        }
        int min=getmin(arr);
        int max=getmax(arr);
        System.out.println("Min of array: "+min+" \n Max of array:"+max);
        scanner.close();
    }

    private static int getmax(int[] arr) {
        int max=arr[0];
        for(int i=0; i<arr.length;i++)
        {
           if(max<arr[i]){
               max=arr[i];
           }
        }
        return max;
    }

    private static int getmin(int[] arr) {
        int min=arr[0];
        for(int i=0; i<arr.length;i++)
        {
           if(min>arr[i]){
               min=arr[i];
           }
        }
        return min;
    }
}
