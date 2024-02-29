package com.adpc.carnejoven.features.buy.domain;

import java.util.ArrayList;

public class GetBuysUseCase {

    private BuyRepository buyRepository;

    public GetBuysUseCase(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public Buy execute() {
        return buyRepository.obtainBuy();
    }
}
