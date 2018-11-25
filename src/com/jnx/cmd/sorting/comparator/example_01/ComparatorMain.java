package com.jnx.cmd.sorting.comparator.example_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
        Player djoko = new Player(1, "Novak Djokovic", 28, "Serbia");
        Player nadal = new Player(5, "Rafael Nadal", 29, "Spain");
        Player feder = new Player(3, "Roger Federer", 34, "Switzerland");
        Player gasqu = new Player(9, "Richard Gasquet", 29, "France");
        
        List<Player> listPlayer = new ArrayList<>();
        listPlayer.add(djoko);
        listPlayer.add(nadal);
        listPlayer.add(feder);
        listPlayer.add(gasqu);

        System.out.println("Before sort:");
        for(Player p1: listPlayer) {
            System.out.println("initial order:  " + p1.getRanking() + "-" + p1.getName());
        }

        Collections.sort(listPlayer, new RankingComparator());
        System.out.println("\nAfter sort by ranking:");
        for(Player p2: listPlayer) {
            System.out.println("ranking: " + p2.getRanking() + "-" + p2.getName());
        }

        Collections.sort(listPlayer, new NameComparator());
        System.out.println("\nAfter sort by name:");
        for(Player p3: listPlayer) {
            System.out.println("name:  " + p3.getRanking() + "-" + p3.getName());
        } 
    }

}