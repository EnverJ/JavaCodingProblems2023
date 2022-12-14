package chapter_2;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckingNullReference_40 {
    static List<Integer> numbers = Arrays.asList(1, 2, null, 4, null,16, 7,null);

    public static List<Integer> evenIntegers (List<Integer> integers) {
        if (integers ==null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr: integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        System.out.println(evenIntegers(numbers));
    }

}
