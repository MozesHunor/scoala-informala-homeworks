package main.java.ro.scit.dealership2;

import java.util.Collections;




public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("e-Up", "Volkswagen", 25000, true, 10, true, 100, 90);
        Car car2 = new Car("e-Golf", "Volkswagen", 38000, true, 10, true, 130, 100);
        Car car3 = new Car("Zoe", "Renault", 33000, true, 10, true, 150, 90);
        Car car4 = new Car("i3", "BMW", 25000, true, 10, true, 150, 130);
        Car car5 = new Car("ForTwo", "Smart", 22000, true, 10, true, 150, 110);
        Car car6 = new Car("ForFour", "Smart", 22700, true, 10, true, 140, 120);
        Car car7 = new Car("ForTwo Cabrio", "Smart", 23000, true, 10, true, 160, 115);
        Car car8 = new Car("Soul", "Kia", 34000, true, 10, true, 170, 160);
        Car car9 = new Car("Ioniq", "Hyundai", 23000, false, 10, false, 180, 125);
        Car car10 = new Car("e-Up", "Volkswagen", 20000, false, 0, false, 150, 130);

        Dealership d = new Dealership();
        d.listOfCars.add(car1);
        d.listOfCars.add(car2);
        d.listOfCars.add(car3);
        d.listOfCars.add(car4);
        d.listOfCars.add(car5);
        d.listOfCars.add(car6);
        d.listOfCars.add(car7);
        d.listOfCars.add(car8);
        d.listOfCars.add(car9);
        d.listOfCars.add(car10);
        System.out.print("This is the list of cars: ");
        for (int i = 0; i < d.listOfCars.size(); i++) {
            System.out.println(d.listOfCars.get(i).getManufacturer() + " " + d.listOfCars.get(i).getModel() + " for the price of " + d.listOfCars.get(i).getPrice() + " euros");
        }
        Customer customer = new Customer("Steve", 25000);


        System.out.println(d.filterByStock());
        System.out.println(d.filterByCharge());
        System.out.println("\n" + "---------------------------------");
        System.out.println("Sorting by price...");
        Collections.sort(d.listOfCars, Car.carPriceComparator);
        for (Car car : d.listOfCars) {
            System.out.println(car);
        }
        System.out.println("\n" + "---------------------------------");
        System.out.println("Sorint by range per charge...");
        Collections.sort(d.listOfCars, Car.carRangeComparator);
        for (Car car : d.listOfCars) {
            System.out.println(car);
        }
        System.out.println("\n" + "---------------------------------");
        System.out.println("Sorting by HP....");
        Collections.sort(d.listOfCars, Car.carHpComparator);
        for (Car car : d.listOfCars) {
            System.out.println(car);
        }

    }
}
