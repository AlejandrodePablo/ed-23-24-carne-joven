package com.adpc.carnejoven.features.promotions.domain;

public class Promotion {

    public final String id;
    private final String title;
    private final String description;
    private final String discount;

    public Promotion(String id, String title, String description, String discount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.discount = discount;
    }
}
