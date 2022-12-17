package geeks;

import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class ArrayCopy {
    @Test
    public void arrayCopy() {
        int a[] = {2, 3, 5, 9, 0, 9};
        int b[] = copyOf(a, a.length);
        System.out.println(Arrays.toString(b));
    }

    @Test
    public void maxArray() {
        int a[] = {2, 5, 3, 9, 0, 9};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);


    }

    @Test
    public void sortArray() {
        Integer[] a = {2, 5, 3, 9, 0, 9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); //[0, 2, 3, 5, 9, 9]
        System.out.println("max to min");
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a)); //[9, 9, 5, 3, 2, 0]

        System.out.println(stream(a).sorted().toList()); //[0, 2, 3, 5, 9, 9]


    }


}
