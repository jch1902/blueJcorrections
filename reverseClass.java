import java.util.*;
/**
 * Write a description of class isReversed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverseClass
{
   //for problem 10
    public reverseClass()
    {
        boolean reversed = false;
        ArrayList<Integer> firstList = new ArrayList();
        ArrayList<Integer> secondList = new ArrayList();
       //adding numbers that will make the method not work
        firstList.add(1);
        firstList.add(3);
        firstList.add(5);
        firstList.add(7);
        secondList.add(5);
        secondList.add(5);
        secondList.add(3);
        secondList.add(1);
        reversed = isReversed(firstList, secondList);
        System.out.println(reversed);
    }

    public static boolean isReversed(ArrayList<Integer> firstList, 
    ArrayList<Integer> secondList) {
        for (int j = 0; j < firstList.size() / 2; j++)
        {
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
            {
                return false;
            }
        }
        return true;
    }
}
