
package burgerresturantmanager;

import java.util.Scanner;

public class Burgerresturantmanager {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("please press 1 for normal burger sandwich \n 2 for healthy sandwich \n 3 for deluxe sandwich");
        int typeOfSandwich = input.nextByte();

        switch (typeOfSandwich) {
            case 1:
                NormalBurger normalBurger = new NormalBurger();
               
                System.out.println(normalBurger.toString());
                System.out.println("the total price is  L.E " + normalBurger.getPrice());
                break;
            case 2:
                HealthyBurger healthyBurger = new HealthyBurger();
                healthyBurger.setTypeOfmeat();
             
                System.out.println(healthyBurger.toString());

                System.out.println("the total price is  L.E " + healthyBurger.getPrice());

                break;
            case 3:
                DeluxeBurger deluxeBurger = new DeluxeBurger(60, "beef", "white", "Deluxe burger");
                System.out.println(deluxeBurger.toString());
                System.out.println("the total price is  L.E " + deluxeBurger.getPrice());

                break;
        }
    }

}