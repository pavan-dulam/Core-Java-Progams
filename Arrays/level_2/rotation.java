package level_2;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an array, cyclically rotate the array clockwise by one. 

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
*/
 class rotation {
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
        rotatedArray(arr);
        scanner.close();
    }

    private static void rotatedArray(int[] arr) {
        int lastelement=arr[arr.length-1];
        
        for(int i=arr.length-1; i>0; i--){
            
            arr[i]=arr[i-1];  
        }
        arr[0]=lastelement; 
        System.out.println("array="+ Arrays.toString(arr));
    }
}
