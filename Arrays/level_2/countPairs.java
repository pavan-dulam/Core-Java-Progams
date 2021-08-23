package level_2;

import java.util.Scanner;

/*Given an array of integers, and a number ‘sum’, 
find the number of pairs of integers in the array whose sum is equal to ‘sum’.

Examples:  

Input  :  arr[] = {1, 5, 7, -1}, 
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)

Input  :  arr[] = {1, 5, 7, -1, 5}, 
          sum = 6
Output :  3
Pairs with sum 6 are (1, 5), (7, -1) &
                     (1, 5)         

Input  :  arr[] = {1, 1, 1, 1}, 
          sum = 2
Output :  6
There are 3! pairs with sum 2.

Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6, 
                   5, 4, 2, 1, 1, 1}, 
          sum = 11
Output :  9*/
public class countPairs {
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
        System.out.println("Enter the sum");
        int sum=scanner.nextInt();
        getsum(arr,sum);
       
        scanner.close();
    }

    private static void getsum(int[] arr,int sum) {
        int count=0;
        for(int i=0; i<arr.length;i++){
            System.out.println("1st for i="+i);
            for(int j=0; j<arr.length;j++)
            {
                System.out.println("2nd for j="+j);
                if(i!=j)
                {
                    System.out.println("1st if");
                    System.out.println("1st if i+j="+(i+j));
                    if(sum==arr[i]+arr[j])
                    {
                        System.out.println("2nd if i+j="+(i+j));
                        count++;
                        System.out.println("result="+count);
                    }
                }
            }
        }
        System.out.println("result="+count/2);
    }
}
