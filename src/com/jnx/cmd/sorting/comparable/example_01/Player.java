/**
 * The Comparable class is included in the package Lang.
 * The package is imported automatically (import java.lang.Comparable)
 */
package com.jnx.cmd.sorting.comparable.example_01;

public class Player implements Comparable {

    private int ranking;
    private String name;
    private int age;
    private String country;

    public Player() {}

    public Player(int ranking, String name, int age, String country) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    // Comparison by ranking
    public int compareTo(Object obj) {
        Player cf = (Player) obj;
        if(this.getRanking()==cf.getRanking()) {
            return 0;
        }else{
            return this.getRanking()-cf.getRanking();
        }
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}