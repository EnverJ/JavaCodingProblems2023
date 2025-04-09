package JavaCodePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SecondSmallestAndLargest {

    public static void main (String [] args) {
        int[] arr = {10, 2, 5, 8, 7, 3, 10, 1};
        //remove the duplicated and sort accending order
        TreeSet<Integer> sort = new TreeSet<>();
        for (int num : arr) {
            sort.add(num);
        }
            List<Integer> sortList = new ArrayList<>(sort);


            if (sortList.size() >= 2) {
                System.out.println("Second Smallest" +sortList.get(1));
                System.out.println("Second Largest: " +sortList.get(sortList.size()-2));

            } else {
                System.out.println("Array doesn't have enough element");

            }
        }
    }
