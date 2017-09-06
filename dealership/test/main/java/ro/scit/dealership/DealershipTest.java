package main.java.ro.scit.dealership;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static main.java.ro.scit.dealership.Dealership.dealership;
import static org.junit.Assert.*;

public class DealershipTest {
    @Test
    public void filterByCharge() throws Exception {
        List<String> hasFastCharging = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].hasFastCharge) {
                hasFastCharging.add(dealership[i].model);
            }
        }
        assertArrayEquals("[e-Up, e-Golf, Zoe, i3, ForTwo, ForFour, ForTwo Cabrio, Soul, Ioniq]", hasFastCharging.toString());
    }

    private void assertArrayEquals(String s, String s1) {
        List<String> isInStock = new ArrayList<>();
        for (int i = 0; i < dealership.length; i++) {
            if (dealership[i].stockNumber > 0) {
                isInStock.add(dealership[i].model);
            }
        }
        assertArrayEquals("[e-Up, e-Golf, Zoe, i3, ForTwo, ForFour, ForTwo Cabrio, Soul, Ioniq]", isInStock.toString());
    }


    @Test
    public void filterByStock() throws Exception {
    }

}