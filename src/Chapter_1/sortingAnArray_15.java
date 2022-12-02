package Chapter_1;


import java.util.Arrays;
import java.util.Comparator;

public class sortingAnArray_15 {
    public void sortArrayByLength(String[] strs,  Sort direction){
        if(direction.equals(Sort.ASC)){
            Arrays.sort(strs, Comparator.comparingInt ( String:: length));

        }else {
            Arrays.sort(strs,Comparator.comparingInt ( String ::length ).reversed());
        }

    }
}
