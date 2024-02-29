package com.adpc.carnejoven.features.buy.domain;

public class CreateBuyUseCase {

    private BuyRepository buyRepository;

    public CreateBuyUseCase(BuyRepository buyRepository) {
        this.buyRepository = buyRepository;
    }

    public void execute(Buy buy){
        this.buyRepository.createBuy(buy);
    }
}
