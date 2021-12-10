package com.revature;

import java.math.BigInteger;

public class Launcher {

	
	 public static BigInteger lookAndsay(BigInteger num){

	        String Numb = num.toString();
	        String Num = "";

	        if(Numb.length()%2==1){
	            return BigInteger.valueOf(-1);
	        }
	        for(int i = 0;i<Numb.length()-1;i+=2){
	            for(int j = Integer.parseInt(Character.toString(Numb.charAt(i)));j>0;j--){
	                Num += Character.toString(Numb.charAt(i+1));
	            }
	        }
	        return new BigInteger(Num);
	    }

	
	public static long lcm_of_array_elements(int[] element_array)
    {
        long lcm_of_array_elements = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < element_array.length; i++) {
 
 
                if (element_array[i] == 0) {
                    return 0;
                }
                else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }
 
                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }
 
            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }

            if (counter == element_array.length) {
                return lcm_of_array_elements;
            }
        }
        
        
        
        
       }

	public static void main(String[] args) {
		
		 int[] arr1 = {5, 4, 6, 46, 54, 12, 13, 17 };
	        System.out.println(lcm_of_array_elements(arr1));
	        
	      int[] arr2 = {46, 54, 466, 544};
	        System.out.println(lcm_of_array_elements(arr2));
	        
	        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        System.out.println(lcm_of_array_elements(arr3));
	        
	        int[] arr4 = {13, 6, 17, 18, 19, 20, 37};
	        System.out.println(lcm_of_array_elements(arr4));
	        
	        
	       
	        System.out.println(lookAndsay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));
	        System.out.println(lookAndsay(BigInteger.valueOf(54544666)));
	        System.out.println(lookAndsay(BigInteger.valueOf(95)));
	        System.out.println(lookAndsay(BigInteger.valueOf(120520)));
	        System.out.println(lookAndsay(BigInteger.valueOf(231)));
	}

}
