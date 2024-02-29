package com.adpc.carnejoven.features.buy.data;

import com.adpc.carnejoven.features.buy.domain.Buy;
import com.adpc.carnejoven.features.buy.domain.BuyRepository;

public class StubBuyDataRepository implements BuyRepository {
    @Override
    public void createBuy(Buy buy) {

    }

    @Override
    public Buy obtainBuy() {
        return null;
    }
}
