package main.java.ro.scit.dealership;

import static main.java.ro.scit.dealership.Dealership.*;


public class Main {

    public static void main(String[] args) {
        initCars(0, "e-Up", "Volkswagen", 25000, true, 10, true, 100, 90);
        initCars(1, "e-Golf", "Volkswagen", 38000, true, 10, true, 130, 100);
        initCars(2, "Zoe", "Renault", 33000, true, 10, true, 150, 90);
        initCars(3, "i3", "BMW", 25000, true, 10, true, 150, 130);
        initCars(4, "ForTwo", "Smart", 22000, true, 10, true, 150, 110);
        initCars(5, "ForFour", "Smart", 22700, true, 10, true, 140, 120);
        initCars(6, "ForTwo Cabrio", "Smart", 23000, true, 10, true, 160, 115);
        initCars(7, "Soul", "Kia", 34000, true, 10, true, 170, 160);
        initCars(8, "Ioniq", "Hyundai", 23000, true, 10, true, 180, 125);
        initCars(9, "e-Up", "Volkswagen", 20000, false, 0, false, 150, 130);


        for (int i = 0; i < dealership.length; i++) {
            System.out.println(dealership[i].getManufacturer() + " " + dealership[i].getModel() + " costs " + dealership[i].getPrice() + " euros, and number of stock is " + dealership[i].getStockNumber());
        }
        System.out.println("---------------------------------");
        System.out.println("These cars have fast charging option: " + filterByCharge());
        System.out.println("---------------------------------");
        System.out.println("These cars are in stock: " + filterByStock());
    }
}
