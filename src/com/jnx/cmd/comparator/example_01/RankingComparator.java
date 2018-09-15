package com.jnx.cmd.comparator.example_01;

import java.util.Comparator;

public class RankingComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        Player p1 = (Player) obj1;
        Player p2 = (Player) obj2;

        if(p1.getRanking()==p2.getRanking()) {
            return 0;
        }else{
            return p1.getRanking()-p2.getRanking();
        }
    }

}