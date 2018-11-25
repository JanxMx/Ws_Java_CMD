package com.jnx.cmd.sorting.comparator.example_02;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparators {

    public static void main(String[] args) {
        ComparatorsController comp01 = new ComparatorsController();
        comp01.arraySort();
        System.out.println("array.sort tested successfully!!!!");
        comp01.sortArrayList();
        System.out.println("collections.sort tested sucessfully!!!!");
        comp01.comparableWithError();
        System.out.println("comparable with error.");
    }
}

class ComparatorsController {

    ComparatorsController() {
        System.out.println("Entro el constructor del controller");
    }

    public void arraySort() {
        String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana"};

        Arrays.sort(fruits);

        int i=0;
        for(String temp: fruits) {
            System.out.println("fruits " +  ++i + ":" + temp);
        }
    }

    public void sortArrayList() {
        List<String> fruits = new ArrayList<>();

        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        Collections.sort(fruits);

        int i=0;
        for(String temp: fruits) {
            System.out.println("fruits " + ++i + ": " + temp);
        }
    }

    public void comparableWithError() {
        Fruit[] fruits = new Fruit[4];

        Fruit pineapple = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruits[0] = pineapple;
        fruits[1] = apple;
        fruits[2] = orange;
        fruits[3] = banana;

        Arrays.sort(fruits);

        int i=0;
        for(Fruit temp: fruits) {
            System.out.println("fruits" + ++i + ": " + temp.getFruitName() +
            ", Quantity: " + temp.getQuantity());
        }
    }
}

class Fruit {
    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
} 