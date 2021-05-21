package demo10;

import java.util.*;

public class Demo10 {

    private static final Integer ONE = 1;
    
    public static void main(String[] args) {
        int x = 0;
        Scanner sn = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            x = sn.nextInt();
            Integer freq = (Integer) m.get(x);
            m.put(x, (freq == null ? ONE : new Integer(freq.intValue() + 1)));
        }
        System.out.println(m.size() + " distinct words detected:");
        // Prints using map
        System.out.println(m);
        
        /* // Uses an interator
        for (Iterator i = m.keySet().iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
        */
        
        String[] arr = {"Moaath", "Ben", "James", "moaath", "Jacob", "Sami"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr, String::compareToIgnoreCase);

        List lst = Arrays.asList(arr);

        Collections.reverse(lst);

        System.out.println(" ==== After sort and reverse======");
        for (Iterator<String> i = lst.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
