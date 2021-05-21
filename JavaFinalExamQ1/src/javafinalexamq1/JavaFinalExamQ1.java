package javafinalexamq1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaFinalExamQ1 {

    private static void printOutput(Map<String, Integer> a) {
        // Create an iterator for the key and the value within the map
        Iterator<String> itKey = a.keySet().iterator();
        Iterator<Integer> itVal = a.values().iterator();
        
        // Use a while loop to print the key (name) and its respective value (ID)
        while (itKey.hasNext()) {
            System.out.println("The name is " + itKey.next() + ", and the ID is " + itVal.next());
        }
    }
    
    public static void main(String[] args) {
        
        Map<String, Integer> listStd = new HashMap<>();
        listStd.put("Moaath Alrajab", 80);
        listStd.put("Jack Smith", 43);
        listStd.put("Noor Sami", 27);
        listStd.put("Ben Fscu", 99);
        listStd.put("Sam Smith", 11);
        
        // Calls function created above
        printOutput(listStd);
        
    }
}