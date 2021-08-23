package level_2;

import java.util.Scanner;

/**
 * Find the largest three distinct elements in an array
 * 
 * Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90, 50, 23
 */
public class threeMaxnumber {
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
        getmax(arr);
        scanner.close();
    }

    private static void getmax(int[] arr) {
        int first=0,second=0,third=0;
        for (int i=0; i<arr.length; i++) {
            
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
               
                
            }
            else
            if(arr[i]>second) {
                third=second;
                second=arr[i];
                
            }
            else
            if(arr[i]>third){
               
                third=arr[i];
            }
        }
        System.out.println(" "+first+" "+second+" "+third);
    }

}
