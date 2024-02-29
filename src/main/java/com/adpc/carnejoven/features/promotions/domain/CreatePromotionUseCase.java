package com.adpc.carnejoven.features.promotions.domain;

public class CreatePromotionUseCase {

    private PromotionRepository promotionRepository;

    public CreatePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public void execute(Promotion promotion) {
        this.promotionRepository.createPromotion(promotion);
    }
}
