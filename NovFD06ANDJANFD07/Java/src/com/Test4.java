package com;

public class Test4 {
	public static void main(String[] args) {

		int[] array = { 1, 2, 7, 10, 20, 3 ,4,3,5};
  
		int[] array1 = new int[array.length - 1];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			// i =5
			if (i != array.length - 1) {
				int num = array[i] + array[count]; // 3 + 3
				// count = 6
				array1[i] = num; // {6,12,17,30,23}

				count++;
			}

		}
		System.out.println("---Print array----");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		System.out.println("\n---Print array1----\n");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}

		  for (int i = 0; i < array1.length; i++) {
			
			    for (int j = 0; j < array1.length; j++) {
					       int temp =0;
			    	  if(array1[i]<array1[j]) {
			    		   temp = array1[i];
			    		   array1[i]=array1[j];
			    		   array1[j]=temp;
			    	  }
				}
		 }
		  System.out.println("\nLowest Number   : "+array1[0]);
	}
}
