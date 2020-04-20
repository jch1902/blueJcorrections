
/**
 * Write a description of class loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loops
{
   
    public loops()
    {
         //question 11
         int arr[] = {4,4,1,2,6,8};
        boolean duplicates = false;
        for (int x = 0; x < arr.length - 1; x++)
        {
            for (int y = 0; y < arr.length; y++)
            {
                if (arr[x] == arr[y])
                {
                    duplicates = true;
                }
            }
        }
        System.out.println(duplicates);
        //question 12
    }


}
