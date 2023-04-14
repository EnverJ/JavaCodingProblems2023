package lambda.geeksLambda;

import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class TestMyFun {
    @Test
     public void testFun() {
         funInterFace fun = (int x)-> System.out.println(2*x);
         fun.abstractFun(5);
         fun.normalFun();
     }
    //10
//Hello

@Test
    public void listLambda () {
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
    }
//1
//2
//3
//4
//2
//4
}
