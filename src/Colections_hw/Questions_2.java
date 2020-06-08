package Colections_hw;

import java.util.HashMap;
import java.util.Map;

public class Questions_2 {
    /*
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         * if there are keys with same value, print the keys otherwise, create method that will "All keys have different values"
         */
    public static void main(String[] args)
    {

        HashMap<Integer, String> keys
                = new HashMap<>();

        print(keys);
        keys.put(10, "happy");
        keys.put(20, " peace");
        keys.put(30,"joy");

        System.out.println("Size of keys is:- "
                + keys.size());

        print(keys);
        if (keys.containsKey("happy")) {
           String a = keys.get("happy");
            System.out.println("value for key"
                    + " \"happy\" is:- "
                    + a);
        }

        keys.clear();
        print(keys);

    }

    public static void print(Map<Integer, String> map)
    {
        if (map.isEmpty()) {
            System.out.println("All keys have different value ");
        }

        else {
            System.out.println("same value ");
        }
    }
}

