package com.java.snippets;

/**
 * Consider a series in ascending order that only consists of numbers that can be factored by any combination
	of 2, 3 and 5. e.g. 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15....
	For example the numbers 7 (prime), 13 (prime) or 14 (2*7, 7 is not a valid factor), are not in the above
	series. They are not factorable by 2, 3, 5.
	The number 1 is included by definition.
	For example, the number in position 18 would be 30:
	1. 1
	2. 2
	3. 3
	4. 4 = 2*2
	5. 5
	6. 6 = 2*3
	7. 8 = 2*2*2
	8. 9 = 3*3
	9. 10=2*5
	10. 12=2*2*3
	11. 15=3*5
	12. 16=2*2*2*2
	13. 18=2*3*3
	14. 20=2*2*5
	15. 24=2*2*2*3
	16. 25=5*5
	17. 27=3*3*3
	18. 30=2*3*5
	
	Design an algorithm to find the number that occupies position 1500 in this series. NOTE: the correct answer
	is 859963392, use this to verify your algorithm.
 * 
 * @author Char Sahota
 * @date Oct. 31, 2019
 *
 * Example output: [1499] : 859963392 = 2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*3*3*3*3*3*3*3*3
 */
public class FactorByNumbers2_3_5 {
	
	/**
	 * Method to calculate sequence number at a specified position.
	 * 
	 * @param num
	 * @return
	 */
	private static int findSequenceAtPosition(int num) {
    	
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        
        int nextNum = 4;
        int index = 3;
        
        while(index<num) {

            int n = nextNum;
            int res = 0;
            StringBuffer factors = new StringBuffer();
            		
        	 // The number of times 2 can be factored 
            while (n % 2 == 0) { 
            	factors.append(2 + "*"); 
                n /= 2; 
                if(res == 0) {
                	res = 2;
                } else {
                	res = res*2;
                }
            } 
            
            // The number of times 3 can be factored
            while (n % 3 == 0) { 
            	factors.append(3 + "*"); 
                n /= 3; 
                if(res == 0) {
                	res = 3;
                } else {
                	res = res*3;
                }
            } 
            
            // The number of times 5 can be factored 
            while (n % 5 == 0) { 
            	factors.append(5 + "*"); 
                n /= 5; 
                if(res == 0) {
                	res = 5;
                } else {
                	res = res*5;
                }
            } 
      
            // Increment nextNum when n is a prime greater than 2.
            if (n > 2) {
            	
            	nextNum++;
            	
            } else {
            	
            	System.out.println(index + " : " + res + " = " + factors.deleteCharAt(factors.length()-1).toString());
            	arr[index] = res;
            	nextNum = ++res;
            	index++;	
            }
        	
        }
        
        return arr[num-1];
    }
	
	/**
	 * Main method to test number sequence.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(findSequenceAtPosition(1500));

	}

}
