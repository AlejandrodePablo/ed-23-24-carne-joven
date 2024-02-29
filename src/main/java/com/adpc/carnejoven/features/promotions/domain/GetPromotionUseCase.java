package com.adpc.carnejoven.features.promotions.domain;

import com.adpc.carnejoven.features.company.domain.GetCompanyUseCase;

public class GetPromotionUseCase {

    private PromotionRepository promotionRepository;

    public GetPromotionUseCase(PromotionRepository promotionRepository){
        this.promotionRepository = promotionRepository;
    }

    public Promotion execute(String id){
        return this.promotionRepository.obtainPromotion(id);
    }
}
