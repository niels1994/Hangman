import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// create array with random numbers between 0 and 100
		int[] random = new Random().ints(10, 0, 100).toArray();
		// print out the random numbers
		System.out.println("Random list of 10 numbers");
		printarray(random);
		
		//print the highest, lowest and even numbers in the list
		highest(random);
		lowest(random);
		even(random);
		// print numbers that can be divided by 2,3 and 5
		// and print out the numbers that can not be divided by 
		// 2,3 or 5 
		dived_show(random);
		
		// sort the list
		bubbleSort(random);
		// print out the sorted list
		System.out.println("Sort the List (lowest to highest)");
		printarray(random);
	}
	public static void printarray(int[] array) {
		// print the array per number
		int i;
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	public static void highest(int[] array) {
		// print the highest number in the List
		int x = 0;
		
		int i;
		
		for (i = 0; i < array.length; i++) {
			if (array[i] > x) {
				x = array[i];
			}
			
		}
		System.out.println("Highest");
		System.out.println(x);
	}
	
 	public static void lowest(int[] array) {
 		// print the lowest number in the List
		int x = 100;
		
		int i;
		
		for (i = 0; i < array.length; i++) {
			if (array[i] < x) {
				x = array[i];
			}
			
		}
		System.out.println("Lowest");
		System.out.println(x);
	}
 	
 	
 	public static void even(int[] array) {
 		// print out the even numbers form a list
 		int i;
 		System.out.println("Even numbers");
		for (i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
 	}
 	public static List<Integer> dived(int[] array,int num) {
 		// print out the numbers that can be dived by a given 
 		// number for a given list 
 		int i;
 		List<Integer> listA = new ArrayList<Integer>();
 		
 		for (i = 0; i < array.length; i++) {
 			if (array[i] % num == 0) {
 				listA.add(array[i]);
 				System.out.println(array[i]);
 			}
 			
 		}
 		return listA;
 	}
 	
 	public static void dived_show(int[] array) {
 		// print out the numbers for a list that can be dived by 
 		// 2,3 and 5 and the rest of the numbers
 		int i;
 		
 		List<Integer> listcombine = new ArrayList<Integer>();
 		
 		System.out.println("can be dived by 2");
 		List<Integer> array2 = dived(array,2);
 		System.out.println("can be dived by 3");
 		List<Integer> array3 = dived(array,3);
 		System.out.println("can be dived by 5");
 		List<Integer> array5 = dived(array,5);
 		System.out.println("can not be dived by 2,3 or 5");
 		
 		listcombine.addAll(array2);
 		listcombine.addAll(array3);
 		listcombine.addAll(array5);
 		
 		for (i = 0;i < array.length;  i++) {
 			if(!listcombine.contains(array[i])) {
 				System.out.println(array[i]);			
 			}
 			
 		}
 		
 	}
 	public static void bubbleSort(int array[]) 
 	// use the bubble Sort method to sort a list
    { 
        int n = array.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    // swap array[j+1] and array[j] 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
    } 

}


