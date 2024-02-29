package com.adpc.carnejoven.features.promotions.domain;

import com.adpc.carnejoven.features.promotions.data.StubPromotionUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetPromotionUseCaseTest {

    private GetPromotionUseCase getPromotionUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getPromotionUseCase = null;
    }

    @Test
    public void siLaListaEstaVaciaNoDevuelveNada() {
        //Given
        getPromotionUseCase = new GetPromotionUseCase(
                new StubPromotionUseCase()
        );
        //When
        Promotion getPromotion = getPromotionUseCase.execute("1");
        //Then
        Assertions.assertNull(getPromotion);
    }
}