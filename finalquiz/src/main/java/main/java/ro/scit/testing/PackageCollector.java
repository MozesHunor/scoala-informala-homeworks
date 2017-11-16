package main.java.ro.scit.testing;

import java.util.ArrayList;
import java.util.Collections;

public class PackageCollector implements Runnable {

    ArrayList<String> locations = new ArrayList<String>();
    Package packages[] = new Package[]{

            new Package("Cluj-Napoca", 10, 25, "23112017"),
            new Package("Cluj-Napoca", 15, 60, "23112017"),
            new Package("Turda", 8, 70, "20112017"),
            new Package("Dej", 7, 25, "23112017"),
    };

    public ArrayList<Package> getPackages() {
        ArrayList<Package> allPackages = new ArrayList<Package>();
        for (Package pack : packages) {
            allPackages.add(pack);
        }
        return allPackages;
    }

    public ArrayList<Package> getPackagesSortedByLocation() {
        ArrayList sorted = new ArrayList(getPackages());
        Collections.sort(sorted, Package.PackageLocationComparator);
        return sorted;
    }

    public ArrayList<Package> getPackagesSortedByDate() {
        ArrayList sorted = new ArrayList(getPackages());
        Collections.sort(sorted, Package.PackageDeliveryDateComparator);
        return sorted;
    }

    public ArrayList<Package> createBunchLocation(ArrayList<Package> list, String location) {
        ArrayList<Package> thisList = new ArrayList<Package>();
        for (int i = 0; i < list.size(); i++) {
            if (location == list.get(i).getLocation()) {
                thisList.add(list.get(i));
            }
        }
        return thisList;
    }

    public ArrayList<Package> createBunchDate(String date) {
        ArrayList<Package> thisList = new ArrayList<Package>();
        for (int i = 0; i < getPackages().size(); i++) {
            if (date == getPackages().get(i).getDeliveryDate()) {
                thisList.add(getPackages().get(i));
            }
        }
        return thisList;
    }

    public void deliver(ArrayList<Package> bunch) {
        double value = 0;
        double profit = 0;
        for (int i = 0; i < bunch.size(); i++) {
            value = value + bunch.get(i).getMerchandiseValue();
            profit = profit + (bunch.get(i).getMerchandiseValue() * bunch.get(i).getDistance());
        }
        System.out.println("The value of the merchandise is: " + value);
        System.out.println("The profit is: " + profit);
    }

    public ArrayList<String> getTheLocations(ArrayList<Package> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!locations.contains(list.get(i).getLocation())) {
                locations.add(list.get(i).getLocation());
            }
        }
        return locations;
    }


    public void run() {
        System.out.println("Delivering the packages...");
    }
}
