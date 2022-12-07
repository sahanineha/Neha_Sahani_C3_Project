
package org.example;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args)  {
        LocalTime openingTime = LocalTime.parse("10:00:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Restaurant restaurant = new Restaurant("MY-RESTAURANT","BANGALORE",openingTime,closingTime);
        restaurant.addToMenu("soup",120);
        restaurant.addToMenu("Noodles",100);
        restaurant.displayDetails();
    }
}
