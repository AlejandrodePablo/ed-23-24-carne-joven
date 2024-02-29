package com.adpc.carnejoven.features.promotions.data;

import com.adpc.carnejoven.features.promotions.domain.Promotion;
import com.adpc.carnejoven.features.promotions.domain.PromotionRepository;

public class StubPromotionUseCase implements PromotionRepository {
    @Override
    public void createPromotion(Promotion promotion) {

    }

    @Override
    public void deletePromotion(String id) {

    }

    @Override
    public Promotion obtainPromotion(String id) {
        return null;
    }

    @Override
    public Promotion obtainPromotions() {
        return null;
    }
}
