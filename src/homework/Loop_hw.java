package homework;

public class Loop_hw {
    public static void main(String[] args) {
        /**
         * Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        int studentScore = 140;
        double maxScore = 150.00;
        double percentage = studentScore*100/maxScore;


        if (percentage>=91 && percentage<=100){
            System.out.println( "Your percentage is: " +percentage + " and your grade is: A ");
        } else if (percentage>=81 && percentage<=90 ){
            System.out.println("Your percentage is: " +percentage + " and your grade is: B ");
        } else if (percentage>=71 && percentage<=80) {
            System.out.println("Your percentage is: " +percentage + " and your grade is: C ");
        } else if (percentage>=61 && percentage<=70){
            System.out.println("Your percentage is: " +percentage + " and your grade is: D ");
        }else if (percentage>=51 && percentage<=60){
            System.out.println("Your percentage is: " +percentage + " and your grade is: E ");

        } else if (percentage<=50 ){
            System.out.println("Your percentage is: " +percentage + " and your grade is: F ");
        } else{
            System.out.println("Invalid percentage: " +percentage);
        }

        /**
         * Checking car mode (P, D, N, R)
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */

        char carMode='N';

        String driveType="";


        switch (carMode){
            case 'P':
                System.out.println("you can park car");
                break;
            case 'D':
                if (driveType.equalsIgnoreCase("snow")){
                    System.out.println("you are on snow mode");

                } else if (driveType.equalsIgnoreCase("sport")){
                    System.out.println(" you are on sport mode");

                } else if (driveType.equalsIgnoreCase("eco")){
                    System.out.println("you are on eco mode");
                }
                break;
            case 'N':
                System.out.println("put car in car wash ");
                break;
            case  'R':
                System.out.println("reverse the car");
                break;
            default:
                System.out.println("invalid entry = "+ carMode+" "+driveType);

        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int value = 40;

        if (value%3 ==0 && value%5==0){
            System.out.println("Value -> " + value + " is divisible by both");
        } else if (value%5==0){
            System.out.println("Value -> " + value+ " is divisible by 5 ");
        } else if (value%3==0){
            System.out.println("Value -> " + value +" is divisible by 3 ");


        }
        else{
            System.out.println(" Print the number " + value);
        }








    }






}
