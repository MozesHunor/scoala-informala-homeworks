package main.java.ro.scit.homework3;

import static main.java.ro.scit.homework3.Bubble.*;

public class Main {

    static SalesRepresentative[] dep = new SalesRepresentative[20];

    public static void main(String[] args) {

        initSalesRepresentative(0, "Guy11", 1, 11, 20);
        initSalesRepresentative(1, "Guy12", 1, 12, 19);
        initSalesRepresentative(2, "Guy13", 1, 13, 18);
        initSalesRepresentative(3, "Guy14", 1, 14, 17);
        initSalesRepresentative(4, "Guy15", 1, 15, 16);

        initSalesRepresentative(5, "Guy21", 2, 16, 15);
        initSalesRepresentative(6, "Guy22", 2, 17, 14);
        initSalesRepresentative(7, "Guy23", 2, 18, 13);
        initSalesRepresentative(8, "Guy24", 2, 19, 12);
        initSalesRepresentative(9, "Guy25", 2, 20, 11);

        initSalesRepresentative(10, "Guy31", 3, 21, 12);
        initSalesRepresentative(11, "Guy32", 3, 22, 20);
        initSalesRepresentative(12, "Guy33", 3, 23, 25);
        initSalesRepresentative(13, "Guy34", 3, 24, 30);
        initSalesRepresentative(14, "Guy35", 3, 25, 10);

        initSalesRepresentative(15, "Guy41", 4, 26, 12);
        initSalesRepresentative(16, "Guy42", 4, 27, 12);
        initSalesRepresentative(17, "Guy43", 4, 28, 12);
        initSalesRepresentative(18, "Guy44", 4, 29, 12);
        initSalesRepresentative(19, "Guy45", 4, 30, 12);

        for (int i = 0; i < 20; i++) {
            dep[i].revenue = dep[i].salesNumber * dep[i].salesPrice;
        }

        String names[] = new String[20];
        int rev[] = new int[20];
        int depart[] = new int[20];
        for (int i = 0; i < 20; i++) {
            names[i] = dep[i].name;
            rev[i] = dep[i].revenue;
            depart[i] = dep[i].department;
            System.out.println("The revenue for " + names[i] + " from department " + depart[i] + " is " + rev[i]);
        }
        bubble(rev, names);
        System.out.println("After bubblesorting...");
        for (int i = 0; i < 20; i++) {
            System.out.println("The revenue for " + names[i] + " is " + rev[i]);
        }
        SalesRepresentative totalSales = getTotal();
        System.out.println("Total is " + totalSales.revenue);

        SalesRepresentative bestOfBest = getBestGuy();
        System.out.println("Best salesrep. of the company is " + bestOfBest.name + " with the revenue of " + bestOfBest.revenue);

        int dep1 = 0;
        for (int i = 0; i < 5; i++) {
            dep1 = dep1 + rev[i];
        }
        int dep2 = 0;
        for (int i = 5; i < 10; i++) {
            dep2 = dep2 + rev[i];
        }
        int dep3 = 0;
        for (int i = 10; i < 15; i++) {
            dep3 = dep3 + rev[i];
        }
        int dep4 = 0;
        for (int i = 15; i < 20; i++) {
            dep4 = dep4 + rev[i];
        }
        int[] anArray = {dep1, dep2, dep3, dep4};
        int temp = 0;
        for (int i = 0; i < anArray.length; i++) {
            if (temp < anArray[i]) {
                temp = anArray[i];
            }
        }
        if (temp == dep1) System.out.println("The best department is department 1 with the total revenue of " + dep1);
        else if (temp == dep2)
            System.out.println("The best department is department 2 with the total revenue of " + dep2);
        else if (temp == dep3)
            System.out.println("The best department is department 3 with the total revenue of " + dep3);
        else System.out.println("The best department is department 4 with the total revenue of " + dep4);
    }


    public static SalesRepresentative getTotal() {
        SalesRepresentative total = new SalesRepresentative();
        total.revenue = 0;
        for (SalesRepresentative guy : dep) {
            total.revenue = total.revenue + guy.revenue;
        }
        return total;
    }

    public static SalesRepresentative getBestGuy() {
        SalesRepresentative bestGuy = new SalesRepresentative();
        bestGuy.revenue = 0;
        bestGuy.name = "";
        for (SalesRepresentative guy : dep) {
            if (bestGuy.revenue < guy.revenue) {
                bestGuy.revenue = guy.revenue;
                bestGuy.name = guy.name;
            }
        }
        return bestGuy;
    }


    public static void initSalesRepresentative(int position, String name, int department, int salesNumber, int salesPrice) {
        dep[position] = new SalesRepresentative();
        dep[position].name = name;
        dep[position].department = department;
        dep[position].salesNumber = salesNumber;
        dep[position].salesPrice = salesPrice;
    }
}
