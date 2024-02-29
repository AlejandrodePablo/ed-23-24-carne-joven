package com.adpc.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public interface PromotionRepository {

    void createPromotion(Promotion promotion);
    void deletePromotion(String id);
    Promotion obtainPromotion(String id);
    Promotion obtainPromotions();
}
