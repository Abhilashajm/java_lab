package week7;

import java.util.Scanner;

public class DemoarraySort{

	public static void main(String[] args) {
		int array[]= new int[10];
		Scanner inScanner= new Scanner(System.in);
		System.out.println("Enter array elements");
		int size= inScanner.nextInt();
		System.out.println("enter array one by one");
		for (int i=0; i<size; i++) 
			array[i]=inScanner.nextInt();
		System.out.println("array elements before sorting are.....");
		for (int i=0; i<size; i++)
			System.out.println(array[i]+ "\t");
		System.out.println();
		inScanner.close();
	    
		for (int i=0; i<size; i++) {
			int minindex=i;
			for (int j=i+1; j<size; j++) {
				if (array[i]< array[minindex])
					minindex=j;	
			}
			int temporary=array[i];
			array[i]=array[minindex];
			array[minindex]=temporary;
		}
		
		System.out.println("array elements after sorting are...");
		for (int i=0; i<size; i++)
			System.out.println(array[i]+"\t");
			
				
	}		
}		
		

	


