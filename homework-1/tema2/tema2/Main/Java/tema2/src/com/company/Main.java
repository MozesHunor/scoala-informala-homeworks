package com.company;


import static com.company.Bubble.bubble;


public class Main {

    public static void main(String[] args) {
        String names[] = {"Guy1", "Guy2", "Guy3", "Guy4"};
        int sales[] = {100, 120, 140, 160};
        int price[] = {18, 16, 14, 11};
        int revenue[] = new int[4];

        for (int i = 0; i < names.length; i++) {
            revenue[i] = sales[i] * price[i];
            System.out.println("The revenue of " + names[i] + " is " + revenue[i]);
        }
        bubble(revenue);
        System.out.println("Sorted by revenue...");

        for (int i = 0; i < names.length; i++) {
            System.out.println("The revenue of " + names[i] + " is " + revenue[i]);
        }

    }
}
