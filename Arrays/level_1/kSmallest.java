package level_1;
import java.util.Scanner;
/*
Given an array and a number k where k is smaller than the size of the array, 
we need to find the k’th smallest element in the given array.
 It is given that all array elements are distinct.

 Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 4 
Output: 10 
*/ 
public class kSmallest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = scanner.nextInt();
        System.out.println("enter elements");
        int[] array = new int[n];
        for (int i = 0; i < n;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("enter value of k : ");
        int k = scanner.nextInt();
        System.out.println(ksmallest(array,k));
        scanner.close();
        
    }

    private static int ksmallest(int[] array, int k) {
            for(int i = 0; i < array.length;i++) {
                for(int j =i+1; j <array.length;j++) {
                    if(array[j]<array[i]) {
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }
            return array[k-1];
    }
}
