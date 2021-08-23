package level_2;

import java.util.Arrays;
import java.util.Scanner;

/*
 QuickSort is a Divide and Conquer algorithm. 
 It picks an element as pivot and partitions the given array around the picked pivot.
  There are many different versions of quickSort that pick pivot in different ways. 

1.Always pick first element as pivot.
2.Always pick last element as pivot   (implemented below)
3.Pick a random element as pivot.
4.Pick median as pivot.

The key process in quickSort is partition(). 
Target of partitions is, 
given an array and an element x of array as pivot,
 put x at its correct position in sorted array and put all smaller elements
  (smaller than x) before x, and put all greater elements (greater than x) after x. 
  All this should be done in linear time.
*/
public class quicksort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n:");
        int n=scanner.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements:");
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        QuickSort(  array,0,n-1);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(array));
        scanner.close();
    }

    private static void QuickSort(int[] array, int low, int high) {
        if(low<high) {
            int pi=partition(array,low,high);
            QuickSort(array,low,pi-1);
            QuickSort(array,pi+1,high);
        }
    }

    static int partition(int[] array,int low, int high){
        int pivot=array[high];
        
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(array[j]<pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,high);
        return (i+1);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
