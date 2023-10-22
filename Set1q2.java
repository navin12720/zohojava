package zohopratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Set1q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10, 36, 54, 89, 12};

	        List<Integer> weightedNumbers = new ArrayList<>();

	        for (int num : numbers) {
	            int weight = calculateWeight(num);
//	            where the  * 1000 used to sort the weigth because for the requirment
	            weightedNumbers.add(weight * 1000 + num); 
	            
	        }

	        Collections.sort(weightedNumbers);

	        for (int weightedNum : weightedNumbers) {
//	        	%1000 used to extract the orginal number from the weightednumber
//	        	For 3010, num becomes 10, and the output will be "<10,3>".
//	        	For 4036, num becomes 36, and the output will be "<36,4>".
//	        	For 4054, num becomes 54, and the output will be "<54,4>".
//	        	For 89, num remains 89, and the output will be "<89,0>".
//	        	For 3012, num becomes 12, and the output will be "<12,3>".
	            int num = weightedNum % 1000;
	            System.out.print("<" + num + "," + calculateWeight(num) + "> ");
	        }
	    }

	    public static int calculateWeight(int num) {
	        if (isPerfectSquare(num)) {
	            return 5;
	        } else if (num % 4 == 0 && num % 6 == 0) {
	            return 4;
	        } else if (num % 2 == 0) {
	            return 3;
	        } else {
	            return 0;
	        }
	    }

	    public static boolean isPerfectSquare(int num) {
//	    	(int): This is a type casting operation. It converts the double value to an integer.
	        int sqrt = (int) Math.sqrt(num);
	        return sqrt * sqrt == num;
	    }
}
