package homework;

public class Home_Work5 {

    public static void main(String[] args) {
        /* Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        // String msg = "have a great day to you";
        //String abr = "";
//code
        // System.out.println("Abbreviation: " + abr);

        String msg = "have a great day to you";
        String[] msg1 = msg.split(" ");
        String msg2 = (msg1[0].substring(0, 1) + msg1[1].substring(0, 1) + msg1[2].substring(0, 1) + msg1[3].substring(0, 1) + msg1[4].substring(0, 1) + msg1[5].substring(0, 1)).toUpperCase();

        System.out.println("Abbreviation : " + msg2);


        /**
         *
         */
       /* String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
        System.out.println("Line (Before modification) : " + line);
//code
        System.out.println("Line (After modification) : " + line);

        */


        String line = "once upOn a tiMe in the UNIVERSE";
        System.out.println("Line (Before modification) : " + line);
        String[] line1 = line.split(" ");
        String newLine1 = line1[0].substring(0, 1).toUpperCase() + line1[0].substring(1).toLowerCase();
        String newLine2 = line1[1].substring(0, 1).toUpperCase() + line1[1].substring(1).toLowerCase();
        String newLine3 = line1[2].substring(0, 1).toUpperCase();
        String newLine4 = line1[3].substring(0, 1).toUpperCase() + line1[3].substring(1).toLowerCase();
        String newLine5 = line1[4].substring(0, 1).toUpperCase() + line1[4].substring(1).toLowerCase();
        String newLine6 = line1[5].substring(0, 1).toUpperCase() + line1[5].substring(1).toLowerCase();
        String newLine7 = line1[6].substring(0, 1).toUpperCase() + line1[6].substring(1).toLowerCase();
        System.out.println("Line (After modification) : " + newLine1 + " " + newLine2 + " " + newLine3 + " " + " " + newLine4 + " " + newLine5 + " " + newLine6 + " " + newLine7);



        /**
         * reverse a string
         */
       /* String message = "happy holidays"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);
// code
        System.out.println("Message in reverse: " + reverseMessage);

        */
        String message = "happy holidays";
        String reverseMessage = "";
        System.out.println("Message : " + message);
        int length = message.length();
        for (int i = length - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + message.charAt(i);
        }

        System.out.println("Message in reverse : " + reverseMessage);



        /**
         * Check if word is palindrome
         */
       /* String word = "level";  //ecar
        boolean result=false;
//code
        System.out.println("is " + word + " a palindrome: " + result);

        */
        String originalWord = "mama";

        int length1 = originalWord.length();
        String reverse1 = "";
        for (int i = length1 - 1; i >= 0; i--) {
            reverse1 = reverse1 + originalWord.charAt(i);


        }
        System.out.println("Reverse result for palindrome part : " + reverse1);
        boolean palindrome = true;
        for (int i = 0; i < originalWord.length(); i++) {
            if (originalWord.charAt(i) != reverse1.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {

            System.out.println(" result is palindrome ");
        } else {
            System.out.println("result is !palindrome");
        }



        












    }
    }

