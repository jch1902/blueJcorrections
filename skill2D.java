
/**
 * Write a description of class skill2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class skill2D
{
    //Questions 16-18
    public skill2D()
    {
        int[] intArr = {10, 8, 3, 4};
        insertionSort(intArr);
        int[] arr = {30, 40, 10, 50, 20};
        selectionSort(arr);
    }
    public static void insertionSort(int[] elements)
    {
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;  
                System.out.println("executed possibleIndex--");
            }
            elements[possibleIndex] = temp;
            System.out.println("executed elements[possibleIndex] = temp;");
        }
    }
    public static void selectionSort(int[] elements)
    {
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            if (j != minIndex)
            {
                int temp = elements[j];
                elements[j] = elements[minIndex];
                elements[minIndex] = temp;   
                System.out.println("elements[minIndex] = temp; executed");
            }
        }

    }
   
}
