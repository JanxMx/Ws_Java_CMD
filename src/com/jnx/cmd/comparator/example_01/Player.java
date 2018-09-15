package com.jnx.cmd.comparator.example_01;

public class Player {

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

    public void setAge() {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

} 