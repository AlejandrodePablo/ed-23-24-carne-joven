package com.adpc.carnejoven.features.buy.data;

import com.adpc.carnejoven.features.buy.data.local.FileLocalDataSource;
import com.adpc.carnejoven.features.buy.domain.Buy;
import com.adpc.carnejoven.features.buy.domain.BuyRepository;

public class BuyDataRepository implements BuyRepository {

    private FileLocalDataSource fileLocalDataSource = new FileLocalDataSource();

    private static BuyDataRepository instance = null;

    public static BuyDataRepository newInstance() {
        if (instance == null) {
            instance = new BuyDataRepository();
        }
        return instance;
    }

    private BuyDataRepository() {

    }

    @Override
    public void createBuy(Buy buy) {
        fileLocalDataSource.save(buy);
    }

    @Override
    public Buy obtainBuy() {
        return fileLocalDataSource.obtain();
    }


}
