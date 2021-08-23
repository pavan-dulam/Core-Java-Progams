package level_1;
import java.util.Scanner;
//Given an array arr[] of size N, the task is to sort this array in ascending order 
public class sort {
  public static void main(String args[]){
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter length of array: ");
      int n=scanner.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
        arr[i]=scanner.nextInt();
      }
      sortArry(arr);
      scanner.close();
  }

private static void sortArry(int[] arr) {

    for(int i=0;i<arr.length-1;i++)
    {
       // System.out.println("i: "+i);
        for(int j=i+1;j<arr.length;j++)
        {
            //System.out.println("J: "+j);
            if(arr[j]<arr[i])
            {
               // System.out.println("if loop ");
               // System.out.println("before arr[i]: "+arr[i]);
               // System.out.println("before arr[j]: "+arr[j]);
                int temp=arr[i];
               // System.out.println("before temp: "+temp);
                arr[i]=arr[j];
                arr[j]=temp;
               // System.out.println("after arr[i]: "+arr[i]);
                //System.out.println("after arr[j]: "+arr[j]);
            }
        }
    }
    for(int i=0;i<arr.length;i++) {
        System.out.println("sorted: "+arr[i]);
    }
}  
}
