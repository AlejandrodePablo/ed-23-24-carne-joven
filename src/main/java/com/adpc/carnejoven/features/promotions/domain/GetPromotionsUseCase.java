package com.adpc.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public class GetPromotionsUseCase {

    private PromotionRepository promotionRepository;

    public GetPromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute() {
        return this.promotionRepository.obtainPromotions();
    }
}
