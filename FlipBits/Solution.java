package arrays.strings.problems;

import java.util.Scanner;

/*
 	Thank you scipio for helping me with this problem.
*/


public class Solution
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		
		
		for (int i = 0; i < loop; i++)
		{
            input.nextLine();
			String num = input.next();
			System.out.println(flipBits(num));
		}
	}
    
    public static String flipBits(String numString) {
    	
    	long longTemp = Long.parseLong(numString);
    	longTemp -= (long) (Integer.MAX_VALUE) + 1;
    	int num = ~Integer.parseInt(Long.toString(longTemp));
    	longTemp = new Long(num) + Integer.MAX_VALUE + 1;
    	return Long.toString(longTemp);
    }
    


    
}