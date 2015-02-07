import java.util.Scanner;
import java.util.ArrayList;

/*
 * @author: Sakshyam Dahal
 * Date: Feb 6, 2015

 * Problem adopted from hackerrank.com
*/


public class LoveLetter {
	
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int numProblems = input.nextInt();

       final ArrayList<Character> ALPHABETS = new ArrayList<Character>();

		for (int i = (int)'a'; i <= (int)'z'; i++)
			ALPHABETS.add((char)i);

        
        for (int i = 0; i < numProblems; i++)
        {
            input.nextLine();
            String loveLetter = input.next();
            System.out.println(operationsForPalindrome(loveLetter, ALPHABETS));
        }
        
        input.close();
    }
    
    // running time O(n) where n is the length of the string
    // space complexity O(1)
    
    public static int operationsForPalindrome(String s)
	{	
    	


		int i = 0;
		int j = s.length() - 1;
		int totalOperations = 0;
		while (i < j)
		{
			char front = s.charAt(i);
			char back = s.charAt(j);
			
			if (front == back)
			{
				// perfect no need to interfere let it go
			}
			else if (front > back)
			{
				// can only reduce the greater to smaller
				// change char at index i to char at index j
				totalOperations += conversionOperation(front, back, ALPHABETS);
			}
			else
			{
				// back is bigger than front
				totalOperations += conversionOperation(back, front, ALPHABETS);

			}

			i++;
			j--;
		}

		return totalOperations;

	}
    
    public static int conversionOperation(char big, char small, ArrayList<Character> ALPHABETS)
    {
    	return ALPHABETS.indexOf(big) - ALPHABETS.indexOf(small);
    }

}