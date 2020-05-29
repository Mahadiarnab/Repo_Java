package Mid_Term1st;
import java.util.Arrays;
public class Second_Answer {
      /* Question 2:
            * Create a method to return missing smallest positive integer (greater than 0) from given array.
            * Example:
            * 	For array : {1, 3, 5, 4, 2, 7}
         * 	Method should return : 6
            *
            * 	For array : {-1, -3, 4, 2}
         * 	Method should return : 1
            *
            * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
         * 	Method should return : 4
            */

    static int solution(int[] A)
    {
        int n = A.length;

        boolean[] present = new boolean[n + 1];


        for (int i = 0; i < n; i++) {


            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;
        }


        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;


        return n + 1;
    }

    public static void main(String[] args)
    {

        int A[] = { 0, 5, -1, 1, 2, 5, 3, 7, 1, 2 };
        System.out.println("Method should return : " + solution(A));
    }
}










