package main.java.ro.scit.homework4;

public class Main {

    public static void main(String[] args) {


        Cars car1 = new Cars(true, 1, 25000, 0, "", 0, 2016, "e-Up", "Volswagen");
        Cars car2 = new Cars(true, 2, 38000, 0, "", 0, 2016, "e-Golf", "Volswagen");
        Cars car3 = new Cars(true, 3, 33000, 0, "", 0, 2016, "Zoe", "Renault");
        Cars car4 = new Cars(true, 4, 40000, 0, "", 0, 2016, "i3", "BMW");
        Cars car5 = new Cars(true, 5, 22000, 0, "", 0, 2016, "ForTwo", "Smart");
        Cars car6 = new Cars(true, 6, 22700, 0, "", 0, 2016, "ForFour", "Smart");
        Cars car7 = new Cars(true, 7, 23000, 0, "", 0, 2016, "ForTwo Cabrio", "Smart");
        Cars car8 = new Cars(true, 8, 34000, 0, "", 0, 2016, "Soul", "Kia");
        Cars car9 = new Cars(true, 9, 23000, 0, "", 0, 2016, "Ioniq", "Hyundai");
        Cars car10 = new Cars(false, 10, 29000, 0, "", 0, 2015, "i3", "BMW");

        Cars[] listOfCars = new Cars[10];
        listOfCars[0] = car1;
        listOfCars[1] = car2;
        listOfCars[2] = car3;
        listOfCars[3] = car4;
        listOfCars[4] = car5;
        listOfCars[5] = car6;
        listOfCars[6] = car7;
        listOfCars[7] = car8;
        listOfCars[8] = car9;
        listOfCars[9] = car10;


        for (int i = 0; i < listOfCars.length; i++) {
            System.out.println(listOfCars[i].manufacturer + " " + listOfCars[i].model + " " + listOfCars[i].price + " euros");
        }


    }


}
