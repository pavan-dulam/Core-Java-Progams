package level_2;
/*
Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 

Output: 20, 80

Input: 
ar1[] = {1, 5, 5} 
ar2[] = {3, 4, 5, 5, 10} 
ar3[] = {5, 5, 10, 20} 

Output: 5, 5

*/

import java.util.Arrays;
import java.util.Scanner;

public class commonElements {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        int[] arr1=acceptArray();
        int[] arr2=acceptArray();
        int[] arr3=acceptArray();
        scanner.close();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        getCommon(arr1,arr2,arr3);
        
    
    }

    private static void getCommon(int[] arr1, int[] arr2, int[] arr3) {
        int len1=arr1.length;
        int len2=arr2.length;
        int len3=arr3.length;
        int i=0,j=0,k=0;
        while(i<len1 && j<len2 && k<len3){
            if(arr1[i]==arr2[j] && arr3[i]==arr3[k]){
                System.out.println("common elements: "+arr1[i]);
                i++;
                j++;
                k++;
            }else
                if(arr1[i]<arr2[j]){
                    i++;
                }
                   else if(arr2[j]<arr3[k]){
                   j++;
                   }
                   else{
                    k++;
                    }
            
        }

    }

    private static int[] acceptArray() {
       
    int n=0;
    
        System.out.println("Enter the number of elements for Array: ");
        n=scanner.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter elements of Array : ");
        for (int i=0; i<n; i++)
        {
           arr[i]=scanner.nextInt();  
        }
        
        return arr;
    }
}
