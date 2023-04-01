package lambda;

import org.testng.annotations.Test;

public class threads implements Runnable {
    @Test
    @Override
    public void run() {
        System.out.println("This code is inside of the thread");
    }
    @Test
    public  void main () {
        threads th = new threads();
     Thread thread =  new Thread(th);
     thread.start();
        System.out.println("This code is outside of the thread");
    }
}
