package String_HW;

public class Practice_forme {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;
        System.out.println(divide(num1, num2));
        System.out.println(divide(30,20));
        int[] numbers={11,22,33,44,55};




    }

    public static double divide(int num1, int num2) {
        double total = 0;

        if (num2 != 0) {
            double num = num1;

            total = num / num2;
        }


        return total;
    }




/**
 * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
 * String nameToSearch = "philip";
 * Create a method that will tell the position of name of the given array
 * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
 * <p>
 * philip is on position-4
 * happy is not present in the array

 */
/**
 * Create a method to find average of an int-array
 * Average of the given array: 123
 */

public static int average(int[] array,int k){
    int totalSum=0;
    for (int i =0;i<k;i++){
        totalSum+=array[i];
    }
    return totalSum/k;
}








}










