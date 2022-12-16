package geeks;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayCopy {
    @Test
    public void arrayCopy () {
    int a[] = {2, 3, 5};
    int b[] = Arrays.copyOf(a, a.length);

        System.out.println(Arrays.toString(b));
}
}
