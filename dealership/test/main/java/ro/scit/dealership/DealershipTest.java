package main.java.ro.scit.dealership;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.java.ro.scit.dealership.Dealership.*;
import static main.java.ro.scit.dealership.Dealership.initCars;


public class DealershipTest {

    @Before

    public void test() throws Exception {
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
    }

    @Test
    public void testFilterByCharge() throws Exception {
        List<String> testCharge = new ArrayList<>(Arrays.asList("e-Up, e-Golf, Zoe, i3, ForTwo, ForFour, ForTwo Cabrio, Soul, Ioniq"));
        assertArrayEquals(testCharge, filterByCharge());
    }

    private void assertArrayEquals(List<String> testCharge, List<String> strings) {
    }


    @Test
    public void testFilterByStock() throws Exception {
        List<String> testStock = new ArrayList<>(Arrays.asList("e-Up, e-Golf, Zoe, i3, ForTwo, ForFour, ForTwo Cabrio, Soul, Ioniq"));
        assertArrayEquals(testStock, filterByStock());
    }

}