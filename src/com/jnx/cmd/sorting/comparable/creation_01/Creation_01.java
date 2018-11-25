package com.jnx.cmd.sorting.comparable.creation_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Creation_01 {

    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));      
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        for(Laptop l: laps)
            System.out.println("Original List: " + l);

        Collections.sort(laps);
        for(Laptop l: laps)
            System.out.println("Sorted List:   " + l);
    }
}

class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public int compareTo(Laptop lap) {
        // this > lap = + (positive value)
        // this < lap = - (negative value)
        // this == lap = 0
        if(this.getRam() == lap.getRam())
            return 1;

        else if(this.getRam() > lap.getRam())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setPrince(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
