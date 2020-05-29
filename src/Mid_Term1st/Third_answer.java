package Mid_Term1st;

public class Third_answer {
    /* Question 3:
            * Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points charged against the license for over speeding.
            *    1. Speed Limit = 70
            *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user gets 12 points for a speed then license is suspended
         *
                 *  Example:
            *      user speed = 78 ; 1 points
         *      user speed = 88 ; 3 points
         *      user speed = 178 ; 21 points (License suspended).
            *      user speed = 70 ; Thank you for driving within the speed limit.
         *
                 *      88 -> 3
                 *      70
                 *      70-75 : 1
                 *      75-80 : 1
                 *      80-85 : 1
                 *      85-88
                 *
                 */

    public static boolean speedingTicket1(int speed, int limit ) {
        if (speed >= 70) {
            return true;
        } else if ( speed >= limit + 5) {
            return true;
        } else if ( (speed >= limit + 5 || speed <= limit - 5)) {
            return true;
        }
        return false;
    }

    public static boolean speedingTicket2(int speed, int limit ) {
        if (speed >= 70) {
            return true;
        }
       if (speed>=100){
            if (speed >= limit + 5) {
                return true;
            }
        } else {
            if (speed >= limit + 5 || speed <= limit - 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean speedingTicket3(int speed, int limit) {
        return speed >= 100 ||  speed >= limit + 10 ||  Math.abs(speed - limit) >= 5;
    }

    public static void main(String[] args) {
        

    }

}
