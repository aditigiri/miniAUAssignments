package Stream;


import java.util.*;
import java.util.stream.Collectors;

public class StreamClass {
	private static final String[] tensPlace = { ""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};

		  private static final String[] nums = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};

		  private static String toWords(int number) {
	        	String temp;
	        	
			    if (number % 100 < 20){
			    	temp = nums[number % 100];
			      number /= 100;
			    }
			    else {
			    	temp = nums[number % 10];
			      number /= 10;

			      temp = tensPlace[number % 10] + temp;
			      number /= 10;
			    }
			    if (number == 0) return temp;
			    return nums[number] + " hundred" + temp;
		  }

	
	
	
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    ArrayList<Integer> arr_list = new ArrayList<Integer>();
	    System.out.println("Enter the input : ");
	    while (inp.hasNextInt()) {
	    	arr_list.add(inp.nextInt());
	    }
	    inp.close();
	    System.out.println(arr_list);
	    List<Integer> five_mul =arr_list.stream().filter(x->x%5==0).collect(Collectors.toList());
	    	 
	    	    System.out.println(five_mul);
	    	    
	    	    for(int i=0;i<five_mul.size();i++)
	    	    {
	    	    	 System.out.println(toWords(five_mul.get(i)));
	    	    }
	}
}
