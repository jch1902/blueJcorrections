import java.util.*;
/**
 * Write a description of class ArrayLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayLists
{
    // for problems 2, 6, 9
    
    public ArrayLists()
    {
        //2
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList();

        //6
        newArrayList.add(newArrayList.size(), newArrayList.size());
        newArrayList.add(newArrayList.size() - 1, newArrayList.size() + 1);
        newArrayList.add(newArrayList.size() - 2, newArrayList.size() + 2);
        System.out.println(newArrayList.toString());
        
        //9
        for (int i = 0; i < newArrayList.size(); i++)
        {
            System.out.print(newArrayList.remove(i));
        }
    }


}
