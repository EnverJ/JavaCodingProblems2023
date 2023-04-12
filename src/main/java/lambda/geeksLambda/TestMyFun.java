package lambda.geeksLambda;

import org.testng.annotations.Test;

public class TestMyFun {
    @Test
     public void testFun() {
         funInterFace fun = (int x)-> System.out.println(2*x);
         fun.abstractFun(5);
         fun.normalFun();
     }
}

//10
//Hello