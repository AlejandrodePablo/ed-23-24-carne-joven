package com.adpc.carnejoven.features.company.domain;

public class Company {
    public final String id;
    private final String name;
    private final String cif;

    public Company(String id, String name, String cif) {
        this.id = id;
        this.name = name;
        this.cif = cif;
    }
}
