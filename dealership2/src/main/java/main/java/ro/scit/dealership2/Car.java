package main.java.ro.scit.dealership2;

import java.util.Comparator;

public class Car {

    private String model;
    private String manufacturer;
    private int price;
    private boolean hasFastCharge;
    private int stockNumber;
    private boolean newCar;
    private int rangePerCharge;
    private int horsePower;

    public Car(String model, String manufacturer, int price, boolean hasFastCharge, int stockNumber, boolean newCar, int rangePerCharge, int horsePower) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.hasFastCharge = hasFastCharge;
        this.stockNumber = stockNumber;
        this.newCar = newCar;
        this.rangePerCharge = rangePerCharge;
        this.horsePower = horsePower;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasFastCharge() {
        return hasFastCharge;
    }

    public void setHasFastCharge(boolean hasFastCharge) {
        this.hasFastCharge = hasFastCharge;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public boolean isNewCar() {
        return newCar;
    }

    public void setNewCar(boolean newCar) {
        this.newCar = newCar;
    }

    public int getRangePerCharge() {
        return rangePerCharge;
    }

    public void setRangePerCharge(int rangePerCharge) {
        this.rangePerCharge = rangePerCharge;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    public static Comparator<Car> carPriceComparator = new Comparator<Car>() {

        public int compare(Car o1, Car o2) {
            int CarPrice1 = o1.getPrice();
            int CarPrice2 = o2.getPrice();

            return CarPrice1 - CarPrice2;
        }
    };

    @Override
    public String toString() {
        return "[Car model=" + model + ", Car price=" + price + ", Range per charge=" + rangePerCharge + ", HP=" + horsePower + "]";
    }

    public static Comparator<Car> carRangeComparator = new Comparator<Car>() {

        public int compare(Car o1, Car o2) {
            int CarRange1 = o1.getRangePerCharge();
            int CarRange2 = o2.getRangePerCharge();

            return CarRange1 - CarRange2;
        }
    };
    public static Comparator<Car> carHpComparator = new Comparator<Car>() {

        public int compare(Car o1, Car o2) {
            int CarHp1 = o1.horsePower;
            int CarHp2 = o2.horsePower;

            return CarHp1 - CarHp2;
        }
    };

}




