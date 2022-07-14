import java.io.*;
import java.util.*;
public class Q3 {

        public static void main(String[] args)
        {
             ArrayList<String> list = new ArrayList<String>();
            list.add("balram");
            list.add("shubham");
            list.add("balram");
            list.add("sam");

            // Stores length of the array
            int N = list.size();
            System.out.print("actual string elements are -> ");
            for(String ls : list)
            {
                // Print actual string
                System.out.print(ls + " ");
            }
            System.out.println("");
            System.out.print("distinct element from the list elements are -> ");
            Set<String> DistString = new HashSet<String>();
            // Traverse the array
            for(int i = 0; i < N; i++)
            {
                // If current string not present into the set
                if (!DistString.contains(list.get(i)))
                {
                    // Insert current string into the set
                    DistString.add(list.get(i));
                }
            }

            // Traverse the set DistString
            for(String string : DistString)
            {
                // Print distinct string
                System.out.print(string + " ");
            }
        }
    }

