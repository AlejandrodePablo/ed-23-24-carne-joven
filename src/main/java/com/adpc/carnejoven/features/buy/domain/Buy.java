package com.adpc.carnejoven.features.buy.domain;

public class Buy {
    private final String id;
    private final String date;
    private final String info;
    private final String userInfo;

    public Buy(String id, String date, String info, String userInfo) {
        this.id = id;
        this.date = date;
        this.info = info;
        this.userInfo = userInfo;
    }
}
