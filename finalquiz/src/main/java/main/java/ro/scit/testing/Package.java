package main.java.ro.scit.testing;

import java.util.Comparator;

public class Package implements Comparable<Package> {


    private String location;
    private int distance;
    private double merchandiseValue;
    private String deliveryDate;

    public Package(String location, int distance, double merchandiseValue, String deliveryDate) {
        this.location = location;
        this.distance = distance;
        this.merchandiseValue = merchandiseValue;
        this.deliveryDate = deliveryDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(double merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static Comparator<Package> PackageLocationComparator = new Comparator<Package>() {

        public int compare(Package package1, Package package2) {

            String packageLocation1 = package1.getLocation().toUpperCase();
            String packageLocation2 = package2.getLocation().toUpperCase();

            //ascending order
            return packageLocation1.compareTo(packageLocation2);

        }
    };

    public static Comparator<Package> PackageDeliveryDateComparator = new Comparator<Package>() {

        public int compare(Package package1, Package package2) {

            String packageDate1 = package1.getDeliveryDate().toUpperCase();
            String packageDate2 = package2.getDeliveryDate().toUpperCase();

            //ascending order
            return packageDate1.compareTo(packageDate2);

        }
    };

    public int compareTo(Package o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Package{" +
                "location='" + location + '\'' +
                ", distance=" + distance +
                ", merchandiseValue=" + merchandiseValue +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}


