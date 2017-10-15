package main.java.ro.scit.dealership2;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    ArrayList<Car> listOfCars = new ArrayList<>();



    public ArrayList<String> filterByCharge() {
        System.out.println("\n" + "---------------------------------");
        System.out.print("These cars have fast-charge: ");
        ArrayList<String> hasFastCharging = new ArrayList<>();
        for (int i = 0; i < listOfCars.size(); i++) {
            if (listOfCars.get(i).isHasFastCharge()) {
                hasFastCharging.add(listOfCars.get(i).getModel());
            }
        }
        return hasFastCharging;
    }

    public List<String> filterByStock() {
        System.out.println("---------------------------------");
        System.out.print("These cars are in stock: ");
        List<String> isInStock = new ArrayList<>();
        for (int i = 0; i < listOfCars.size(); i++) {
            if (listOfCars.get(i).getStockNumber() > 0) {
                isInStock.add(listOfCars.get(i).getModel());
            }
        }
        return isInStock;
    }

    Customer c = new Customer("John", 25000);

    public void buyCarAtFullPrice(Car car) {
        if (checkCustomersCash(c, car) == true) {
            checkAndDecreaseStock(car);
        }
    }


    public boolean checkCustomersCash(Customer c, Car car) {
        if (c.getCash() < car.getPrice()) {
            System.out.println("Sorry, you don't have enough money");
            return false;
        } else {
            return true;

        }
    }

    public void checkAndDecreaseStock(Car car) {
        if (car.getStockNumber() <= 0) {
            System.out.println("Sorry, this car is not in stock.");
        } else {
            car.setStockNumber(car.getStockNumber() - 1);
        }

    }

    public void requestBonus() {
        if (checkGreenBonus() == true) {
            g.setBudget(g.getBudget() - 10000);
            c.setCash(c.getCash() + 10000);
        }
    }


    GreenBonusProgram g = new GreenBonusProgram(1000000);

    public boolean checkGreenBonus() {
        if (g.getBudget() < 10000) {
            System.out.println("Sorry there are no more bonuses at the moment.");
            return false;
        } else {
            return true;
        }
    }


}

