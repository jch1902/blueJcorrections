
/**
 * Write a description of class sequenceSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sequenceSearch
{
    //quesiton 15
    public sequenceSearch()
    {
        int[] intArr = { 0, 1, 6, 4 , 4, 5    };
        int target = intArr[3];
        System.out.println(seqSearch(intArr, target) + "first method");
         System.out.println(seqSearch2(intArr, target) + "second method");
    }

   public int seqSearch(int[] arr, int target){

        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == target)
            {
                return j;
            }
        }
        return -1;
   }
   public int seqSearch2(int[] arr, int target)
   {
        for (int j : arr)
        {
            if (j == target)
            {
                return j;
            }
        }
        
        return -1;

   }
}
