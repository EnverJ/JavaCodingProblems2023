package JavaCodePractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedsArray {
    public static void main(String [] args){
        int[] arr = {2,5,6,8,9,7,4,7,9};
        Set<Integer> set = new HashSet<>();
        for( int num: arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
