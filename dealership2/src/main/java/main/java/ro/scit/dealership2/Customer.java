package main.java.ro.scit.dealership2;


import java.util.ArrayList;

public class Customer {


    public Customer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    private String name;
    private static int cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {return cash; }

    public void setCash(int cash) {
        this.cash = cash;
    }
    public ArrayList<Car> myCars = new ArrayList<>();
}


