import java.util.Scanner;


public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
		int loop = input.nextInt();
		
		
		for (int i = 0; i < loop; i++)
		{
            input.nextLine();
			int num = input.nextInt();
			System.out.println(flipBits(num));
		}
	}
    
    
    public static long flipBits(int num)
    {
        return Long.valueOf(Integer.toBinaryString(~num), 2);    
    }

    
}