package level_1;
import java.util.Arrays;
import java.util.Scanner;

/*An array contains both positive and negative numbers in random order.
 Rearrange the array elements so that all negative numbers appear before all positive numbers.

 Note: Order of elements is not important here.
 */
public class moveNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++)
        {
           arr[i]=scanner.nextInt();  
        }
        getsorted(arr);
        scanner.close();
    }

    private static void getsorted(int[] arr) {
        for(int i=0,j=0; i<arr.length; i++){
            if(arr[i]<0)
            {
                if (i != j) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
                j++;

            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
