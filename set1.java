package zohopratice;
public class set1 {
//	This code will print the word "PMRAORGORRAPM" in the 'X' format as shown in the pattern 
		
	public static void main(String[] args) {
	    String word = "PMRAORGORRAPM";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
		
		
		
	}
	

}
