public class Solution {

/*
 * @author: Sakshyam Dahal
 * Date: Feb 11, 2015
 * Time complexity O(n) 
 * Space complexity O(1) since there are only 26 characters which is a constant
*/

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = hasPalindromeAnagram(inputString);
        System.out.println(ans);
        myScan.close();
    }
    
    public static String hasPalindromeAnagram(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++)
		{
			if (map.containsKey(s.charAt(i)))
			{	
				map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}

		Collection<Integer> values = map.values();
		boolean even = ( s.length() % 2 == 0 );
		
		int numOdds = 0;
		for (int a : values)
		{
			if (odd(a))
				numOdds++;
		}

		if (even && numOdds == 0)
			return "YES";
		else if ( !even && numOdds == 1)
			return "YES";
		else
			return "NO";
	}
	
	public static boolean odd(int num)
	{
		return num % 2 != 0;
	}

}
