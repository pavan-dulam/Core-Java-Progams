package level_2;
import java.util.*; 
import java.io.*;
/*
Longest Increasing Sequence
Have the function LongestIncreasingSequence(arr)
take the array of positive integers stored in arr and
return the length of the longest increasing subsequence (LIS).
A LIS is a subset of the original list where the numbers are in sorted order, 
from lowest to highest, and are in increasing order. The sequence does not need to be contiguous or unique, 
and there can be several different subsequences. 
For example: if arr is [4, 3, 5, 1, 6] then a possible LIS is [3, 5, 6], and another is [1, 6]. 
For this input, your program should return 3 because that is the length of the longest increasing subsequence.

Examples
Input: new int[] {9, 9, 4, 2}
Output: 1
Input: new int[] {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90}
Output: 7
*/
public class LongestIncreasingSequences {

    public static int LongestIncreasingSequence(int[] arr) {
        int n=arr.length;
        int lis[]=new int[n];
        int i,j,max=0;
        
        for(i=0;i<n;i++)
          lis[i]=1;
    
        for(i=1;i<n;i++)
          for(j=0;j<i;j++)
            if(arr[i]>arr[j] && lis[i]<lis[j]+1)
              lis[i]=lis[j]+1;
    
        for(i=0;i<n;i++)
          if(max<lis[i])
            max=lis[i];
        return max;
      }
    
      public static void main (String[] args) {  
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90};
        System.out.print(LongestIncreasingSequence(arr)); 
      }
     
}
