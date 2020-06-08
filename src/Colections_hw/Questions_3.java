package Colections_hw;


import java.util.*;

public class Questions_3 {

    /*Question 3:
     * Create a hashMap with any numbers of key-value pairs from the user (Key - String, Value - Integer)
     * Create a method that will take hashMap as input and returns the name of student(s) who scored maximum marks.
     */


    /**
     * School:
     * Student1 - 55
     * Student2 - 65
     * Student3 - 75
     * Student4 - 85
     * Student5 - 95
     *
     * Store the data in appropriate variable
     * and print the name of student who scored max marks.
     *
     * 1. Store data in scoreSheet map variable
     * 2. get allValues from scoreSheet (scores)
     * 3. find max value in score-Collection
     * 4. find key(Student Name) corresponding to max-value (max-score)
     *
     */
    public static void main(String[] args) {


    Map<String, Integer> scoresheet = new HashMap<>();
        scoresheet.put("student1" , 55);
        scoresheet.put("student2" , 265);
        scoresheet.put("student3" , 175);
        scoresheet.put("student4" , 85);

    Collection<Integer> scores = scoresheet.values();

    Object[] arr = scores.toArray();
        System.out.println(Arrays.toString(arr));

    Integer maxScore = Collections.max(scores);

    String topper = "";
        for (String name : scoresheet.keySet()) {
        if (scoresheet.get(name) == maxScore) {
            topper = name;
            break;
        }
    }
        System.out.println(topper + " scored max (" + maxScore + ") in the class");



}}

