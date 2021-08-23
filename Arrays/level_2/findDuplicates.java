package level_2;

import java.util.Scanner;

/**
 Find duplicates in O(n) time and O(1) extra space 

 ven an array of n elements that contains elements from 0 to n-1,
  with any of these numbers appearing any number of times.
   Find these repeating numbers in O(n) and using only constant memory space.

Example: 

Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6

Explanation: The numbers 1 , 3 and 6 appears more
than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3

Explanation: The number 3 appears more than once
in the array.
 */
public class findDuplicates {
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
        getDuplicates(arr);
        scanner.close();
    }

    private static void getDuplicates(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n;i++){
            arr[arr[i]%n]=arr[arr[i]%n]+n;
            System.out.println("a= "+arr[arr[i]%n]);
           
        }
        for(int i=0; i<n;i++){
            arr[i]=arr[i]/n;
            System.out.println("b= "+arr[i]);
            if(arr[i]>1){
            System.out.println("duplicates= "+i);
           
            }
            
        }
        
    }
}
