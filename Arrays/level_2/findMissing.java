package level_2;

import java.util.Scanner;

/*
You are given a list of n-1 integers and these integers are in the range of 1 to n.
 There are no duplicates in the list. One of the integers is missing in the list. 
 Write an efficient code to find the missing integer.
Example: 

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4
*/
public class findMissing {
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
        getMissing(arr);
        getMissingByXOR(arr);
        scanner.close();
    }

    private static void getMissingByXOR(int[] arr) {
        int xor1=arr[0];
        int xor2=1;
        for(int i=1; i<arr.length; i++){
            xor1=xor1 ^ arr[i];
        }
        for(int i=2; i<=arr.length+1;i++){
            xor2=xor2 ^ i;
        }
        System.out.println("result by XOR="+(xor1 ^ xor2));
    }

    private static void getMissing(int[] arr) {
       int n=arr.length+1;
       int sumOfArrayLength=n*(n+1)/2;
       
       int sumOfArray=0;
       for(int i=0; i<n-1; i++) {
           sumOfArray=sumOfArray+arr[i];
       }
      
       System.out.println("result by arithmatic="+(sumOfArrayLength-sumOfArray));
    }

    

}
