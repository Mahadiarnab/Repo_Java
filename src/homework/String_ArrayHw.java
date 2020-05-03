package homework;

import sun.security.util.Length;

import java.sql.SQLOutput;
import java.util.Arrays;

public class String_ArrayHw {
    /* /**
*

     */



    public static void main(String[] args) {
        /*Store your first name in a variable, and display the following:
*     1. Display length of the first name.
*     2. Does your name starts with "K" (Considering cases)
*     3. First alphabet of your name
*     4. Does your name ends with "M" (Ignoring cases)

         */


        //1. Display length of the first name.

        String myFirstName = "Mahadi" ;
         int myFirstNameLength = myFirstName.length();
        System.out.println("This Is My First Name Length = " + myFirstNameLength + " . " );

        //  2. Does your name starts with "K" (Considering cases).

        String myNameInLowerCase = myFirstName. toLowerCase();
        System.out.println("My Name In Lower Case = "+ myNameInLowerCase);
        String myNameInUpperCase = myFirstName.  toUpperCase();
        System.out.println("My Name In Upper Case = " + myNameInUpperCase);
        boolean isMyNameStartsWithK = myFirstName.startsWith("k");
        System.out.println("Does My Name Start With 'K'? = " + isMyNameStartsWithK + ".");


        // 3. First alphabet of your name .

        char firstAlphabetOfMyName = myFirstName.charAt(0);
        System.out.println("First Alphabet Of My Name = " + firstAlphabetOfMyName + ".");


        // 4. Does your name ends with "M" (Ignoring cases)

        Boolean isMyNameEndsWithM = myNameInUpperCase.endsWith("M");
        System.out.println("Does My Name End With 'M'? = " + isMyNameEndsWithM +".");


        /**
         * String myStatment = "I am a good programmer";
         * * Use string methods to do following tasks:
         * * 	1. Fetch the last word of the sentence
         * * 	2. Display the total number of words in the myStatement.
         * * 	3. replace all the 'r' characters with 'f' characters.
         */

        /* 1. Fetch the last word of the sentence.

         */
        String myStatment = "I am a good programmer";
        int myStatementl= myStatment.length();
        System.out.println("My Statement length  = " + myStatementl);
        int myIndexOf = myStatment.indexOf("programmer") ;
        System.out.println("My Statement Index Of = " + myIndexOf );
      String mySubString = myStatment.substring(myStatment.lastIndexOf(" "));
        System.out.println("Fetch The Last Word = " + mySubString );

        /* 2. Display the total number of words in the myStatement.

         */

        System.out.println("Display the total number of words in the myStatement = " + myStatment.split(" ").length);


        //3.replace all the 'r' characters with 'f' characters.

        String myStatementReplace =  myStatment.replace('r', 'f' );
        System.out.println("replace all the 'r' characters with 'f' characters = " + myStatementReplace );



        /** * Store your first name in a string variable.
         * Calculate the length of your name, without using length() method of String class.
         *
         */
         String firstName1= "mahadi";
         int count = 0;
         for (char c : firstName1.toCharArray()){
             count++;

         }
        System.out.println("Calculate the length of your name, without using length() method of String clas = " + count );
































    }







}
