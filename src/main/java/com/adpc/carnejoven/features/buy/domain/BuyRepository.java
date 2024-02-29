package com.adpc.carnejoven.features.buy.domain;

public interface BuyRepository {

    void createBuy(Buy buy);

    Buy obtainBuy();

}
