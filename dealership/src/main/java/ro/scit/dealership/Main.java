package main.java.ro.scit.dealership;

import static main.java.ro.scit.dealership.Dealership.*;


public class Main {

    public static void main(String[] args) {
        initCars(0, "e-Up", "Volkswagen", 25000, true, 10, true);
        initCars(1, "e-Golf", "Volkswagen", 38000, true, 10, true);
        initCars(2, "Zoe", "Renault", 33000, true, 10, true);
        initCars(3, "i3", "BMW", 25000, true, 10, true);
        initCars(4, "ForTwo", "Smart", 22000, true, 10, true);
        initCars(5, "ForFour", "Smart", 22700, true, 10, true);
        initCars(6, "ForTwo Cabrio", "Smart", 23000, true, 10, true);
        initCars(7, "Soul", "Kia", 34000, true, 10, true);
        initCars(8, "Ioniq", "Hyundai", 23000, true, 10, true);
        initCars(9, "e-Up", "Volkswagen", 20000, false, 0, false);


        for (int i = 0; i < dealership.length; i++) {
            System.out.println(dealership[i].manufacturer + " " + dealership[i].model + " costs " + dealership[i].price + " euros, and number of stock is " + dealership[i].stockNumber);
        }
        System.out.println("---------------------------------");
        filterByCharge();
        System.out.println("---------------------------------");
        filterByStock();
    }
}
