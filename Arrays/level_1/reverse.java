package level_1;
import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.println("enter size of array:");
      int n=scanner.nextInt();
      int[] arr=new int[n];
      System.out.println("enter elements of array:");
      for (int i=0;i<n;i++) {
          arr[i]=scanner.nextInt();
      }
      reverseArray(arr);
      scanner.close();
  }

private static void reverseArray(int[] arr) {
    int[] revArry=new int[arr.length];
    for (int j=0, i=arr.length-1;i>=0;i--,j++) {
        revArry[j]=arr[i];
        System.out.println("reversed array element "+j+" : "+revArry[j]);
    }
    
}  
}
