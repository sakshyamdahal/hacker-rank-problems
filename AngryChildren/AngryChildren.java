import java.util.Arrays;

/*
 * @author: Sakshyam Dahal
 * Date: Feb 11, 2015

 * Time complexity: O(n log(n)) time it takes to sort the numbers
 * Space complexity: O(1)
*/

public class AngryChildren {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      
      for(int i = 0; i < numPackets; i ++)
      {
         packets[i] = Integer.parseInt(in.readLine());
      }
      
      int unfairness = Integer.MAX_VALUE;
      
      Arrays.sort(packets); // n log n complexity
       
      for (int i = 0; i < packets.length - numKids; i++)
      {
          int newUnfairness = unfairnessAmount(i, numKids - 1, packets);
          if (newUnfairness < unfairness)
          {
              unfairness = newUnfairness;
          }
      }
      
      System.out.println(unfairness);
   }
    
   public static int unfairnessAmount(int index, int items, int[] array)
   {
       return array[index + items] - array[index];
   }
    
    
}