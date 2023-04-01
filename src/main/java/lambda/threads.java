package lambda;

import org.testng.annotations.Test;

public class threads implements Runnable {
    // Threads allows a program to operate more efficiently by doing multiple things at the same time.
    //Threads can be used to perform complicated tasks in the background without interrupting the main program.
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
