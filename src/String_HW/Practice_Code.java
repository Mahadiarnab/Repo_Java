package String_HW;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Practice_Code {
    public static void main(String[] args) {
        String name = " Happy New Year ";
        String[] name1 = name.split(" ");
        System.out.println("name1 =" + Arrays.toString(name1));
        String name2 = name.toUpperCase();
        System.out.println("name2 = " + name2);
        String name3 = name.trim();
        System.out.println("name3 = " + name3);
        String name4 = name.trim().toUpperCase();
        System.out.println("name4 = " + name4);
        int name6 = name.lastIndexOf("r");
        System.out.println("name6 =" + name6);
        String nameNew = "hello dear, how are you? ";
        int name7 = nameNew.length();
        boolean name8 = name7 > 10 ? true : false;
        System.out.println("name8 = " + name8);
        String myFullName = "Mahadi Hasan Arnab";
        int name9 = myFullName.split(" ")[0].length();
        String name10 = name9 > 7 || myFullName.toUpperCase().startsWith("A") ? "enrolled" : "Try later";
        System.out.println("name10 = " + name10);

        String myWords = "happy new year ";
        String[] venN = myWords.split(" ");
        String venn = venN.length == 3 ? "yes" : "no";
        System.out.println(venn);
        String my = (venN[0].substring(0, 1) + venN[1].substring(0, 1) + venN[2].substring(0, 1)).toUpperCase();
        System.out.println(my);

        String myF = "hello dear";
        String myS = "hello dear";
        String[] m1 = myF.split(" ");
        String[] m2 = myS.split(" ");


        String namk = " hello dear ow are you";
        String newsen = namk.contains("how") ? namk.toUpperCase() : namk.replace("r", "R");
        System.out.println(newsen);


        String myStatement = "mahadi";
        String[] myNewStatement = myStatement.split("");
        int myL = myNewStatement.length;
        System.out.println("my new statement : " + myL);

        /**
         * String fullname = "Happy peace love laugh";
         *
         * if full name consists of, first-name, middle-name and last-name:
         * print name like:
         * First Name : Happy
         * Middle name : Peace
         * Last name : Love
         *
         * if name consists of, first-name and last-name:
         * print name like:
         * First Name : Happy
         * Last name : Peace
         *
         * if name consists of, first-name:
         * print name like:
         * First Name : Happy
         *
         * name longer than 3 words, print below:
         * print below:
         * Invalid full name entered: Happy peace love laugh
         *
         */


        String loops = "Happy";
        boolean result = true;
        if (loops.length() > 10) {
            System.out.println(loops.toUpperCase());
            System.out.println(loops.replace('p', 'n'));
        } else {
            result = !true;


        }
        System.out.println("result " + result);


        /**
         * days= weekend, clothes= casual
         * days= weekdays, and meeting = false , clothes = formals
         * days= weekdays , and meeting= true , clothes = suit
         */

        /**
         * int num = X;
         *
         * print the number if the value of odd
         */

        int num = 14;
      if (num%2 != 0 ) {
          System.out.println(num);
      }
        /**
         * String fullname = "Happy peace love laugh";
         *
         * if full name consists of, first-name, middle-name and last-name:
         * print name like:
         * First Name : Happy
         * Middle name : Peace
         * Last name : Love
         *
         * if name consists of, first-name and last-name:
         * print name like:
         * First Name : Happy
         * Last name : Peace
         *
         * if name consists of, first-name:
         * print name like:
         * First Name : Happy
         *
         * name longer than 3 words, print below:
         * print below:
         * Invalid full name entered: Happy peace love laugh
         *
         */

        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */

        int value = 50;
        if (value%3 ==0 && value%5==0){
            System.out.println(value + "divisible by both");
        } else if (value%5==0){
            System.out.println(value+ " divisible by 5 ");
        } else if (value%3==0){
            System.out.println( value +"divisible by 3 ");

        }
        else{
            System.out.println("print the number " + value);
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
                System.out.println("you can park car ");
                break;
            case 'D':
                if (driveType.equalsIgnoreCase("SNOW")){
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

           /** * Create variable to store student-score, and total-possible-score based on the percentage,
            * display grade to student
            * Grade A: 91-100
            * Grade B: 81-90
            * Grade C: 71-80
            * Grade D: 61-70
            * Grade E: 51-60
            * Grade F: less than or equal to 50
            */
        //calculate percentage
        //Your percentage: XX.yy and your grade is: A

      double studentScore = 160 ;
        int maxScore = 150;
          double percentage = studentScore*100/150;


          if (percentage>=91 && percentage<=100){
              System.out.println( "your percentage is: " +percentage + " and your grade is: A ");
          } else if (percentage>=81 && percentage<=90 ){
              System.out.println("your percentage is: " +percentage + " and your grade is: B ");
          } else if (percentage>=71 && percentage<=80) {
              System.out.println("your percentage is: " +percentage + " and your grade is: C ");
          } else if (percentage>=61 && percentage<=70){
              System.out.println("your percentage is: " +percentage + " and your grade is: D ");
          }else if (percentage>=51 && percentage<=60){
              System.out.println("your percentage is: " +percentage + " and your grade is: E ");

          } else if (percentage<=50 ){
              System.out.println("your percentage is: " +percentage + " and your grade is: F ");
          } else{
              System.out.println("Invalid percentage: " +percentage);
          }























    }
































    }









