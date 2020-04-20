
//question 2 and 5
public class intArrays
{
   
    public intArrays()
    {
        //2
        int[]secondArr = new int[2];
        int[] arr = { 4, 3, 2, 1, 0};
        //5
        int total = 0;
        for(int k = 0;k<=total;k++){
            if(arr[k] % 2 ==0){
                total+=arr[k];
                System.out.println("add" + arr[k]);
            }else{
                total -=arr[k];
                System.out.println("subtract" + arr[k]);
            }
        }
        System.out.print(total);
        question8();
    }
    private static void question8(){
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("first for loop: " + numbers[i]);
        }
        
        for (int x : numbers){
            System.out.println("second for loop: " + x);
        }
    }
}
