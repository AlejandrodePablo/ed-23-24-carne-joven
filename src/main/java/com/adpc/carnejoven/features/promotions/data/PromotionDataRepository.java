package com.adpc.carnejoven.features.promotions.data;

import com.adpc.carnejoven.features.promotions.data.local.FileLocalDataSource;
import com.adpc.carnejoven.features.promotions.domain.Promotion;
import com.adpc.carnejoven.features.promotions.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {

    private FileLocalDataSource fileLocalDataSource = new FileLocalDataSource();

    private static PromotionDataRepository instance = null;

    private PromotionDataRepository() {

    }

    public static PromotionDataRepository newInstance() {
        if (instance == null) {
            instance = new PromotionDataRepository();
        }
        return instance;
    }

    @Override
    public void createPromotion(Promotion promotion) {
        fileLocalDataSource.save(promotion);
    }

    @Override
    public void deletePromotion(String id) {
        fileLocalDataSource.clear();
    }

    @Override
    public Promotion obtainPromotion(String id) {
        return fileLocalDataSource.obtain();
    }

    @Override
    public Promotion obtainPromotions() {
        return fileLocalDataSource.obtain();
    }
}
