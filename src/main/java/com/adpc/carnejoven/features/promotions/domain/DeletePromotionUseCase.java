package com.adpc.carnejoven.features.promotions.domain;

public class DeletePromotionUseCase {

    private PromotionRepository promotionRepository;

    public DeletePromotionUseCase(PromotionRepository promotionRepository){
        this.promotionRepository = promotionRepository;
    }

    public void execute(String id){
        this.promotionRepository.deletePromotion(id);
    }
}
