package level_1;
import java.util.Scanner;

/* Check if a key is present in every segment of size k in an array

Given an array arr[] and size of array is n and one another key x, and give you a segment size k.
 The task is to find that the key x present in every segment of size k in arr[]. */

 /*
 Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, 
{3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.

Input : 
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
x = 23 
k = 5 
Output :Yes 
There are three segments and last segment is not full {21, 23, 56, 65, 34},
 {54, 76, 32, 23, 45} and {21, 23, 25}. 
 
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
x = 8 
k = 2 
Output : No
 */

 class Arrayk{
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
         System.out.println("Enter key");
         int x=scanner.nextInt();
         System.out.println("Enter segment size:");
         int k=scanner.nextInt();
         if(findxinkindowSize(arr,x,k))
		 {
			System.out.println("yes");
		 }
		 else{
			System.out.println("No");
		 }
         scanner.close();
     }

    private static boolean findxinkindowSize(int[] arr, int x, int k) {
        int i,j;
        for(i=0;i<arr.length; i=i + k){
		for( j=0;j<k;j++){
			if(i+j< arr.length && arr[i+j]==k)
				break;
			if(j==k)
				return false;
			if(i+j>=arr.length)
				return false;
		}
	}
	if(i>=arr.length)
	return true;
	else
	return false;
    
 }
}



