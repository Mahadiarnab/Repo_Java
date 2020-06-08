package Colections_hw;

import java.util.*;

public class Questions_1 {


    /*Create a method, that will return all duplicates values with count from the given String List
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     *

     *


     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("happy");
        list.add("peace");
        list.add("joy");
        list.add("grow");
        list.add("joy");
        list.add("laugh");
        list.add("happy");
        list.add("laugh");
        list.add("joy");



        System.out.println("\nExample  - Count all with frequency");
        Set<String> uniqueSet = new HashSet<String>(list);
        for (String temp : uniqueSet) {
            System.out.println(temp + ": " + Collections.frequency(list, temp));
        }

        System.out.println("\nExample  - Count all with Map");
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }


    }

    public static void printMap(Map<String, Integer> map){

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : "
                    + entry.getValue());
        }
}}
















