package chapter_2;

import org.testng.annotations.Test;

import java.awt.*;
import java.util.Objects;

public class nullPointerExceptionCar_41 {
    private final String name;
    private final Color color;

public nullPointerExceptionCar_41(String name, Color color) {
        this.name = Objects.requireNonNull(name,"Ca name cannot be null");
        this.color = Objects.requireNonNull(color,"Car color cannot be null");
        System.out.println("name: "+name+", color: "+color);
    }

     public void assignDriver(String license, double location) {
         Objects.requireNonNull(license, "License cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
         System.out.println("license: "+license+", location: "+location);

    }
//     @Test
//     public void testCar () {
//
//   new nullPointerExceptionCar_41("Toyota", Color.RED);
//  //  assignDriver("123445323", Point.distance(2,3,4,5));
//     }

    public static void main(String[] args) {
        new nullPointerExceptionCar_41(null, Color.RED);// output: Exception in thread "main" java.lang.NullPointerException: Ca name cannot be null
    new nullPointerExceptionCar_41("Toyota", Color.RED);// output: name: Toyota, color: java.awt.Color[r=255,g=0,b=0]
    }
}
