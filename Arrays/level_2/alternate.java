package level_2;
import java.util.Arrays;
/**
 Given an array of positive and negative numbers, 
 arrange them in an alternate fashion such that every positive number is followed
 by negative and vice-versa maintaining the order of appearance. 
Number of positive and negative numbers need not be equal. 
If there are more positive numbers they appear at the end of the array.
 If there are more negative numbers, they too appear in the end of the array.

 Examples : 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
 */

/*import java.util.Scanner;

public class alternate {
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
        System.out.println("array: "+Arrays.toString(arr));
        getalternate(arr);
       
        scanner.close();
    }

    private static void getalternate(int[] arr) {
        int j=0,k=1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0){
                System.out.println(" j arr[i]="+arr[i]);
                if(arr[j]>0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                //arr[j]=arr[i];
                j=j+2;
                System.out.println("test even: "+Arrays.toString(arr)+"  j="+j);
            }else{
                System.out.println(" k arr[i]="+arr[i]);
                if(arr[k]<0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                }
                //arr[k]=arr[i];
                k=k+2;
                System.out.println("test odd: "+Arrays.toString(arr)+"  k="+k);
            }
        }
        System.out.println("alternated array: "+Arrays.toString(arr));
    }
   /* private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }*/
// Java program to find the missing number
// in the equation a + b = c
}