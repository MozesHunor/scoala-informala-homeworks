package main.java.ro.scit.homework4;


public class Cars {
    boolean isItNew;
    int stockNumber;
    int price;
    float energyConsumption;
    String electricMotor;
    int electricBattery;
    int productionYear;
    String model;
    String manufacturer;

    public Cars(boolean isItNew, int stockNumber, int price, float energyConsumption, String electricMotor, int electricBattery, int productionYear, String model, String manufacturer) {
        this.isItNew = isItNew;
        this.stockNumber = stockNumber;
        this.price = price;
        this.energyConsumption = energyConsumption;
        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.productionYear = productionYear;
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
