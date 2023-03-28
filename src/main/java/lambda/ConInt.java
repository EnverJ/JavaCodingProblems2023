package lambda;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ConInt {
    // consumer Interface
    @Test
    public void Consumerint () {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(9);
    arr.add(8);
    arr.add(7);
    arr.add(6);
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    arr.forEach(method);
    }

   }

