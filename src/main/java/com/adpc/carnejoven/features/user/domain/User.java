package com.adpc.carnejoven.features.user.domain;

public class User {

    public final String nif;
    private final String name;
    private final String surname;
    private final String adress;

    public User(String nif, String name, String surname, String adress) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }
}
