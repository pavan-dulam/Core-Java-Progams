package level_1;
import java.util.Scanner;

public class zerosNOnes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("enter element: ");
        for(int i = 0; i <n;i++){
            array[i] = scanner.nextInt();
        } 
        sort(array);
        scanner.close();
    }

    private static void sort(int[] array) {
        for(int i =0;i<array.length;i++) {
            for(int j =i+1;j<array.length;j++) {
                if(array[j]<array[i]) {
                    int temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i= 0;i<array.length;i++){
            System.out.println("SORTED:"+array[i]);
        }
    }
    
}
