package level_1;
import java.util.Scanner;

/*Given an array arr of integer elements,
 the task is to find the range and coefficient of range of the given array where: 
Range: Difference between the maximum value and the minimum value in the distribution. 
Coefficient of Range: (Max – Min) / (Max + Min). 

Examples: 
 

Input: arr[] = {15, 16, 10, 9, 6, 7, 17} 
Output: Range : 11 
Coefficient of Range : 0.478261 
Max = 17, Min = 6 
Range = Max – Min = 17 – 6 = 11 
Coefficient of Range = (Max – Min) / (Max + Min) = 11 / 23 = 0.478261
Input: arr[] = {5, 10, 15} 
Output: Range : 10 
Coefficient of Range : 0.5 
*/
public class coefficient {
 /*   public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scanner.nextInt();
        System.out.println("enter elements of array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        coefficientArry(arr);
        scanner.close();
    }

    private static void coefficientArry(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
            int range= arr[arr.length-1]-arr[0];
           
            float rangeCoefficient= (float) range/(arr[arr.length-1]+arr[0] );
            System.out.println("range="+range+"\n rangeCoefficient="+rangeCoefficient);
        
    } */

    // method 2 time complexity O(n)
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter size of array");
        int n=scanner.nextInt();
        System.out.println("enter elements of array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        coefficientArry(arr);
        scanner.close();
    }

    private static void coefficientArry(int[] arr) {
        float min=getMin(arr);
        float max=getMax(arr);
        
            float range= max-min;
           
            float rangeCoefficient= range/(max+min);
            System.out.println("range="+range+"\n rangeCoefficient="+rangeCoefficient);
        
    }

    private static float getMin(int[] arr) {
        float res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            res=Math.min(res, arr[i]);
        }
        return res;
    }

    private static float getMax(int[] arr) {
        float res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            res=Math.max(res, arr[i]);
        }
        return res;
    }
}
