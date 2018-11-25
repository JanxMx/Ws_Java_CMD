package com.jnx.cmd.sorting.comparable.example_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {
        Player djoko = new Player(1, "Novak Djokovic", 28, "Serbia");
        Player nadal = new Player(5, "Rafael Nadal", 29, "Spain");
        Player feder = new Player(3, "Roger Federer", 34, "Switzerland");
        Player gasqu = new Player(9, "Richard Gasquet", 29, "France");

        List<Player> listCF = new ArrayList<>();
        listCF.add(djoko);
        listCF.add(nadal);
        listCF.add(feder);
        listCF.add(gasqu);

        System.out.println("Before sort:");
        for(Player cf: listCF) {
            System.out.println(cf.getRanking() + "-" + cf.getName());
        }

        Collections.sort(listCF);

        System.out.println("\nAfter sort:");
        for(Player cf: listCF) {
            System.out.println(cf.getRanking() + "-" + cf.getName());
        }
    }

}