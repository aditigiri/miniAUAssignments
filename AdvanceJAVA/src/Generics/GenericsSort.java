package Generics;
import java.util.Arrays;

public class GenericsSort {
	 private <E> void swap(E[] arr, int i, int j) {
	        if (i != j) {
	            E temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }

	    public <E extends Comparable<E>> void selectionSort(E[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int small = i;
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j].compareTo(arr[small])<=0) {
	                    small = j;
	                }
	            }
	            swap(arr, i, small);  
	        }
	    }

	    public static void main(String[] args){
	        GenericsSort sort_array = new GenericsSort();

	        Integer[] arr_int = {76,34,54,98,12};
	        System.out.println("The original integer array is    : "+ Arrays.toString(arr_int));
	        sort_array.selectionSort(arr_int);
	        System.out.println("After sorting the array is       : "+Arrays.toString(arr_int));
	         Character[] arr_char= {'g','w','h','a','h'};
	         System.out.println("\nThe original character array is : "+ Arrays.toString(arr_char));
	         sort_array.selectionSort(arr_char);
	         System.out.println("After sorting the array is      : "+Arrays.toString(arr_char));
	    }
}
