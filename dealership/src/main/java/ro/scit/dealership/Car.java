package main.java.ro.scit.dealership;

public class Car {
    private String model;
    private String manufacturer;
    private int price;
    private boolean hasFastCharge;
    private int stockNumber;
    private boolean isItNew;
    private int rangePerCharge;
    private int horsePower;

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

    public boolean isItNew() {
        return isItNew;
    }

    public void setItNew(boolean itNew) {
        isItNew = itNew;
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
}
