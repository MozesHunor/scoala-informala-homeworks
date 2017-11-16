package main.java.ro.scit.testing;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PackageCollector packageCollector = new PackageCollector();
        ArrayList<Package> todaysList = packageCollector.createBunchDate("23112017");
        ArrayList<String> todaysLocations = packageCollector.getTheLocations(todaysList);
        ArrayList<ArrayList<Package>> todaysDelivery = new ArrayList<ArrayList<Package>>();

        System.out.println(packageCollector.getPackages());
        System.out.println("Sorted by delivery date:  " + packageCollector.getPackagesSortedByDate());
        System.out.println("Sorted by delivery location:  " + packageCollector.getPackagesSortedByLocation());
        System.out.println("Today's packages:   " + todaysList);

        for (int i = 0; i < todaysLocations.size(); i++) {
            todaysDelivery.add(packageCollector.createBunchLocation(todaysList, todaysLocations.get(i)));
        }
        System.out.println("Today's delivery: " + todaysDelivery);

        for (int i = 0; i < todaysLocations.size(); i++) {
            Thread thisDelivery = new Thread(new PackageCollector());
            thisDelivery.start();
            packageCollector.deliver(todaysDelivery.get(i));
        }
    }
}
