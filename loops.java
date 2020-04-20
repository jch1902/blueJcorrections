
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
       question11();
       question12();
       question13();
       
    }
    public static void question11(){
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
    }
    public static void question12(){
         //question 12
        int[]reverseArr = {1,2,3,4,5};
        for (int k = 0; k < reverseArr.length / 2; k++)
        {
            int temp = reverseArr[k];
            reverseArr[k] = reverseArr[reverseArr.length - k - 1];
            reverseArr[reverseArr.length - k - 1] = temp;
        }
        
    }
    public static void question13(){
        //question 13
        
        int[] values = {1,3,4,5,2};
        int maximum = values[0];

        for (int k = 1; k < values.length; k++)
        {
            if (values[k] > maximum)
            {
                maximum = values[k];
            }
        }
        System.out.println(maximum);
    }


}
