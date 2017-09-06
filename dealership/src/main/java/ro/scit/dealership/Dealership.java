package main.java.ro.scit.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    static Car[] dealership = new Car[10];

    public static void initCars(int position, String model, String manufacturer, int price, boolean hasFastCharge, int stockNumber, boolean isItNew) {
        dealership[position] = new Car();
        dealership[position].model = model;
        dealership[position].manufacturer = manufacturer;
        dealership[position].price = price;
        dealership[position].hasFastCharge = hasFastCharge;
        dealership[position].stockNumber = stockNumber;
        dealership[position].isItNew = isItNew;
    }

    public static void filterByCharge() {
        System.out.println("These cars have fast charge: ");
        List<String> hasFastCharging = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].hasFastCharge) {
                hasFastCharging.add(dealership[i].model);
            }
        }
        System.out.println(hasFastCharging);
    }

    public static void filterByStock() {
        System.out.println("These cars are in stock: ");
        List<String> isInStock = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].stockNumber > 0) {
                isInStock.add(dealership[i].model);
            }
        }
        System.out.println(isInStock);
    }
}
