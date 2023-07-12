package arrayrotation;

import java.util.Scanner;

public class ArrayRotation {

	public static int[] reverseTheRange(int array[],int start,int end) {
		for(int i=start;i<end;i++) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		if(b>n)
			b%=n;
		int results[] = reverseTheRange(array,0,n-1);
		results = reverseTheRange(array,0,b-1);
		results = reverseTheRange(array,b,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(results[i]+" ");
		}

	}

}
