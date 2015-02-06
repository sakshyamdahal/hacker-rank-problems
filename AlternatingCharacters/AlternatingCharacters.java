import java.util.Scanner;

/*
 * @author: Sakshyam Dahal
 * Date: Feb 6, 2015

 * Problem adopted from hackerrank.com

 * Time complexity for numReqDeletions method O(n) where n is the length of the string
 * Space complexity O(1)
*/


public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numCases = input.nextInt();


		for( int i = 0; i < numCases; i++ )
		{
			input.nextLine();
			String inputStr = input.next();
			System.out.println(numReqDeletions(inputStr));
		}
	}

	public static int numReqDeletions(String s)
	{
		char current = s.charAt(0);

		int i = 1;
		int strLen = s.length();
		int deletions = 0;

		while ( i < strLen )
		{
			// they are alternating that's perfect
			if ( s.charAt(i) != current )
			{
				current = s.charAt(i);
				i++;
			}
			// if they are not different then we gotta interfere
			else
			{
				while( i < strLen && s.charAt(i) == current )
				{
					deletions++;
					i++;
				}
			}
		}

		return deletions;
	}
}