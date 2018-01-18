package Lambda;

@FunctionalInterface  
interface NumberNames{  
    String names(int number);  
}  
  
public class LambdaClass{  
    public static void main(String[] args) {  
    	String[] tensPlace = { ""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
    
    	String[] nums = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
    	
    
    	NumberNames ans = (number)-> {  
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
		    
        };  
            System.out.println(ans.names(113));  
    }

	
}  