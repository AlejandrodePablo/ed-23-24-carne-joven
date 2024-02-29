package com.adpc.carnejoven.features.promotions.presentation;

import com.adpc.carnejoven.features.promotions.data.PromotionDataRepository;
import com.adpc.carnejoven.features.promotions.domain.*;

import java.util.ArrayList;

public class MainPromotion {

    public static void createPromotion(Promotion promotion) {
        PromotionDataRepository promotionDataRepository = PromotionDataRepository.newInstance();
        CreatePromotionUseCase createPromotionUseCase = new CreatePromotionUseCase(promotionDataRepository);
        createPromotionUseCase.execute(promotion);
    }

    public static void deletePromotion(String id) {
        DeletePromotionUseCase deletePromotionUseCase = new DeletePromotionUseCase(PromotionDataRepository.newInstance());
        deletePromotionUseCase.execute(id);
    }

    public static void printPromotion(String id) {
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newInstance());
        Promotion promotion = getPromotionUseCase.execute(id);
        System.out.println(promotion.toString());
    }

    public static void printPromotions() {
        GetPromotionsUseCase getPromotionsUseCase = new GetPromotionsUseCase(PromotionDataRepository.newInstance());
        Promotion promotions = getPromotionsUseCase.execute();
        System.out.println(promotions.toString());
    }
}
