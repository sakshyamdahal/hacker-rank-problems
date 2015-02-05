import java.util.Scanner;

/*
 * author: Sakshyam Dahal
 * Date: Feb 5, 2015
 * 
 * Problem adopted from hacker rank
 */

public class UtopianTree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numData = input.nextInt();

		for (int i = 0; i < numData; i++)
		{
			input.nextLine();
			int numCycle = input.nextInt();
			utopianTree(numCycle);
		}
	}

	public static void utopianTree(int numCycles)
	{
		int currentHeight = 1;

		for ( int i = 0; i < numCycles; i++)
		{
			if (isSpring(i))
				currentHeight *= 2;
			else
				currentHeight += 1;

		}

		System.out.println(currentHeight);
	}

	public static boolean isSpring(int numCycle)
	{
		return isEven(numCycle);
	}


	public static boolean isEven(int num)
	{
		return num % 2 == 0;
	}

