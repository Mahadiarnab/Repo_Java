package Mid_Term1st;
import java.util.Arrays;


public class MidTermAnswer {
    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */


    public static int[] removeElements(int[] arr, int remove)
    {

        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != remove)
                arr[index++] = arr[i];


        return Arrays.copyOf(arr, index);
    }


    public static void main(String[] args) {

        int[] array = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        int remove = 24;
        array = removeElements(array, remove);

        System.out.println("Returned Array " + Arrays.toString(array));










    }}









































