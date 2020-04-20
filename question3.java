
/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question3
{
    
    public question3()
    {
        checkString(new String[0]);
        
        String[] str = {"apple", "bannana"};
        checkString(str);
    }

   public static int checkString(String[] arr)
   {
        int count = 0;
        for (int k = 0; k < arr.length; k++)
        {
            if (arr[k].length() >= 3)
            {
                count++;
            }
        }
        return count;
}
}
