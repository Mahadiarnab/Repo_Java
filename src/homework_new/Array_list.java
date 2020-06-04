package homework_new;



import java.util.HashSet;

import java.util.Set;

public class Array_list {
    /**
     * Create a method, that will return all duplicates values in the given String array.
     * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
     * Result -> ["happy", "joy", "laugh"]
     */
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        Set<String> duplicate = new HashSet<String>();
        for (String word : words) {
            if (duplicate.add(word) == false) {
                System.out.println("DUPLICATE WORDS IS :: " + word);
            }
        }
    }


}




















































