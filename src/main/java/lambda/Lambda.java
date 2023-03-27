import org.testng.annotations.Test;

import java.util.ArrayList;

public class Lambda {

     @Test
    public void LambdaEx () {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(2);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.forEach( (n) -> System.out.println(n));

    }
}
