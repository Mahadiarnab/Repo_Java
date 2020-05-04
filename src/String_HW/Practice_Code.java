package String_HW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_Code {
    public static void main(String[] args) {
        String name= " Happy New Year ";
       String[] name1 = name.split(" ");
        System.out.println("name1 =" + Arrays.toString(name1));
       String name2 = name.toUpperCase();
        System.out.println("name2 = "+name2 );
       String name3 = name.trim();
        System.out.println("name3 = " + name3);
       String name4 = name.trim().toUpperCase();
        System.out.println("name4 = " + name4 );
        int name6 = name.lastIndexOf("r");
        System.out.println("name6 ="+ name6 );
        String nameNew= "hello dear, how are you? ";
        int name7=nameNew.length();
        boolean name8 = name7 >10? true:false ;
        System.out.println("name8 = "+ name8 );
        String myFullName = "Mahadi Hasan Arnab";
         int name9 = myFullName.split(" ")[0].length();
         String name10 = name9>7 || myFullName.toUpperCase().startsWith("A")?"enrolled":"Try later";
        System.out.println("name10 = " + name10 );

       String myWords = "happy new year ";
       String[] venN= myWords.split(" ");
       String venn= venN.length == 3 ? "yes" : "no";
        System.out.println(venn);
       String my= (venN[0].substring(0,1)+venN[1].substring(0,1)+venN[2].substring(0,1) ). toUpperCase();
        System.out.println(my);

        String myF = "hello dear";
        String myS = "hello dear";
        String[] m1 = myF.split(" ");
        String[]m2= myS.split(" ");


        String namk = " hello dear ow are you";
        String newsen= namk.contains("how")?namk.toUpperCase():namk.replace("r","R");
        System.out.println(newsen);


        String myStatement = "mahadi";
       String[] myNewStatement = myStatement.split("");
       int myL = myNewStatement.length;
        System.out.println("my new statement : " + myL);














    }








}
