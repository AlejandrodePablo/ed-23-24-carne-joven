package com.adpc.carnejoven.features.buy.presentation;

import com.adpc.carnejoven.features.buy.data.BuyDataRepository;
import com.adpc.carnejoven.features.buy.domain.Buy;
import com.adpc.carnejoven.features.buy.domain.CreateBuyUseCase;
import com.adpc.carnejoven.features.buy.domain.GetBuysUseCase;

import java.util.ArrayList;

public class MainBuy {

    public static void printBuy() {
        GetBuysUseCase getBuysUseCase = new GetBuysUseCase(BuyDataRepository.newInstance());
        Buy buys = getBuysUseCase.execute();
        System.out.println(buys.toString());
    }

    public static void createBuy(Buy buy) {
        BuyDataRepository buyDataRepository = BuyDataRepository.newInstance();
        CreateBuyUseCase createBuyUseCase = new CreateBuyUseCase(buyDataRepository);
        createBuyUseCase.execute(buy);
    }
}
