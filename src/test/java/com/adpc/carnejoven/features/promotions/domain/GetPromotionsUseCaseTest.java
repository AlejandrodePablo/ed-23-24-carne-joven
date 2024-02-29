package com.adpc.carnejoven.features.promotions.domain;

import com.adpc.carnejoven.features.promotions.data.StubPromotion2UseCase;
import com.adpc.carnejoven.features.promotions.data.StubPromotionUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetPromotionsUseCaseTest {


    private GetPromotionsUseCase getPromotionsUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionsUseCase = null;
    }

    @Test
    public void siLaListaEstaVaciaNoDevuelveNada() {
        //Given
        getPromotionsUseCase = new GetPromotionsUseCase(
                new StubPromotion2UseCase()
        );
        //When
        Promotion getPromotion = getPromotionsUseCase.execute();
        //Then
        Assertions.assertNull(getPromotion);
    }
}