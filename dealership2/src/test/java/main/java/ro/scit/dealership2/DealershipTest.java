package main.java.ro.scit.dealership2;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DealershipTest {

    @Before

    public void test() throws Exception {
        Car car1 = new Car("e-Up", "Volkswagen", 25000, true, 10, true, 100, 90);
        Car car2 = new Car("e-Golf", "Volkswagen", 38000, true, 10, true, 130, 100);
        Car car3 = new Car("Zoe", "Renault", 33000, false, 10, true, 150, 90);

        dealershipTest.listOfCars.add(car1);
        dealershipTest.listOfCars.add(car2);
        dealershipTest.listOfCars.add(car3);

    }


    Car car1 = new Car("e-Up", "Volkswagen", 25000, true, 10, true, 100, 90);
    Car car2 = new Car("e-Golf", "Volkswagen", 38000, true, 10, true, 130, 100);
    Car car3 = new Car("Zoe", "Renault", 33000, false, 10, true, 150, 90);


    Dealership dealershipTest = new Dealership();


    @Test
    public void filterByCharge() throws Exception {
        ArrayList<Car> expected = new ArrayList<>();
        expected.add(car1);
        expected.add(car2);
        assertArrayEquals(expected, filterByCharge());


    }


    @Test
    void filterByStock() {
    }

    @Test
    void buyCarAtFullPrice() {

    }

    @Test
    void checkCustomersCash(Customer c, Car car) {
    }


    @Test
    void checkAndDecreaseStock(Car car1) {

        assertEquals(9, car1.getStockNumber());
    }

    @Test
    void requestBonus() {
    }

    @Test
    void checkGreenBonus() {
    }

}
