package main.java.ro.scit.dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    static Car[] dealership = new Car[10];

    public static void initCars(int position, String model, String manufacturer, int price, boolean hasFastCharge, int stockNumber, boolean isItNew, int rangePerCharge, int horsePower) {
        dealership[position] = new Car();
        dealership[position].setModel(model);
        dealership[position].setManufacturer(manufacturer);
        dealership[position].setPrice(price);
        dealership[position].setHasFastCharge(hasFastCharge);
        dealership[position].setStockNumber(stockNumber);
        dealership[position].setItNew(isItNew);
        dealership[position].setRangePerCharge(rangePerCharge);
        dealership[position].setHorsePower(horsePower);

    }

    public static List<String> filterByCharge() {
        List<String> hasFastCharging = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].isHasFastCharge()) {
                hasFastCharging.add(dealership[i].getModel());
            }
        }
        return hasFastCharging;
    }

    public static List<String> filterByStock() {
        List<String> isInStock = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].getStockNumber() > 0) {
                isInStock.add(dealership[i].getModel());
            }
        }
        return isInStock;
    }
}
