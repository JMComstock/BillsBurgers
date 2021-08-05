package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 7.95, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.52);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.01);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.95);
        healthyBurger.addHamburgerAddition1("Egg", 5.42);
        healthyBurger.addHealthyAddition1("Avocado", 3.01);
        System.out.println("Total Healthy Burger Price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 49.99);
        db.itemizeHamburger();
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
