package com.jnx.cmd.sorting.comparator.creation_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(brand + "-" + ram + "-" + price);
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

class BrandComparator implements Comparator {
    
    @Override
    public int compare(Object obj1, Object obj2) {
        Laptop l1 = (Laptop) obj1;
        Laptop l2 = (Laptop) obj2;
        return l1.getBrand().compareTo(l2.getBrand()); 
    }
} 

class RamComparator implements Comparator {
    
    @Override
    public int compare(Object obj1, Object obj2) {
        Laptop l1 = (Laptop) obj1;
        Laptop l2 = (Laptop) obj2;

        if(l1.getRam()==l2.getRam()) {
            return 0;
        }else{
            return l1.getRam()-l2.getRam();
        }
    }
} 

class PriceComparator implements Comparator {
    
    @Override
    public int compare(Object obj1, Object obj2) {
        Laptop l1 = (Laptop) obj1;
        Laptop l2 = (Laptop) obj2;
        
        if(l1.getPrice()==l2.getPrice()) {
            return 0;
        }else{
            return l1.getPrice()-l2.getPrice();
        }
    }
} 

public class Creation_01 {

    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));      
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        for(Laptop l: laps)
            System.out.println("Original List: " + l);

        Collections.sort(laps, new BrandComparator());
        for(Laptop l: laps)
            System.out.println("Sorted for Brand: " + l);

        Collections.sort(laps, new RamComparator());
        for(Laptop l: laps)
            System.out.println("Sorted for Ram:   " + l);

        Collections.sort(laps, new PriceComparator());
        for(Laptop l: laps)
            System.out.println("Sorted for Price: " + l);                
    }
}
