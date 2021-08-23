package level_2;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array of integers, find the first repeating element in it.
 We need to find the element that occurs more than once and whose index of first occurrence is smallest. 

 Examples: 

Input:  arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5 [5 is the first element that repeats]

Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
Output: 6 [6 is the first element that repeats]
*/
public class firstRepeating {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n:");
        int n=scanner.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements:");
        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        //int repeating=getFirstRepeating(array);
        //System.out.println("First Repeating number: " + repeating);
        int index = firstRepeated(
			array,
			array.length); // index Of 1st repeating number
		if (index != -1) {
			System.out.println("1st Repeatig Number is "
							+ array[index]);
		}
		else {
			System.out.println("No Repeating Number Found");
		}
        scanner.close();
    }

  /*  private static int getFirstRepeating(int[] array) {
        int max=0;
        for(int i=0; i<array.length;i++) {
            System.out.println("array[i]="+array[i]);
            if(array[i]>max){
                max=array[i];
                System.out.println("max="+max);
            }
        }
        int[] temp=new int[max+1];
        Arrays.fill(temp,0);

        for(int i=0;i<array.length;i++) {
            int num=array[i];
            System.out.println("num="+num);
            temp[num]++;
            System.out.println("temp[num]="+temp[num]);
            System.out.println("temp[num]++="+(temp[num]++));
        }

        for(int i=0; i<array.length;i++){
            int num=array[i];
            System.out.println("3rd for loop num="+num);
            System.out.println(Arrays.toString(temp));
            if(temp[num]>1){
                return array[i];
            }
        }
        return -1;
    }*/

    public static int firstRepeated(int[] arr, int n)
	{
		int max = 0;
		for (int x = 0; x < n; x++) {
            System.out.println("array[i]="+arr[x]);
			if (arr[x] > max) {
				max = arr[x];
                System.out.println("max="+max);
			}
		}
		int temp[]
			= new int[max + 1]; // the idea is to use
								// temporary array as hashmap
		Arrays.fill(temp, 0);
        System.out.println(Arrays.toString(temp));

		for (int x = 0; x < n; x++) {
           
			int num = arr[x];
            System.out.println("num="+num);
            System.out.println("temp[num]="+temp[num]);
			temp[num]++;
		}

		for (int x = 0; x < n; x++) {
			int num = arr[x];
            System.out.println(Arrays.toString(temp));
			if (temp[num] > 1) {
				return x;
			}
		}

		return -1; // if no repeating element found
	}
}
