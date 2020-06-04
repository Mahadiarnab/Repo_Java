package homework_new;

import java.util.ArrayList;
import java.util.List;

public class Array_hw2 {



    /* Create a method, that will return the common elements/value in two given int-array
     * int[] arr1 = {11, 32, 43, 54, 65}
     * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     * Result -> [11, 32, 43]

     */
    public static void main(String[] args) {



    int myArray[] = {11, 32, 43, 54, 65  };
    int myArray2[] = { 76, 11, 89, 43, 87, 23, 32 };

    Array_hw2 myNumbers = new Array_hw2();
        System.out.println(" Common Elements result is :: "  + myNumbers.findCommonElement(myArray, myArray2));
}
    public List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {

                    if (!commonElements.contains(a[i])) {

                        commonElements.add(a[i]);
                    }
                }
            }
        }
        return commonElements;
    }}


