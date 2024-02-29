package com.adpc.carnejoven.features.buy.domain;

import com.adpc.carnejoven.features.buy.data.StubBuyDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetBuysUseCaseTest {

    private GetBuysUseCase getBuysUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getBuysUseCase = null;

    }

    @Test
    public void siLaListaEstaVaciaEntoncesNoDevuelveNada() {
        //Given
        getBuysUseCase = new GetBuysUseCase(
                new StubBuyDataRepository()
        );
        //When
        Buy getBuy = getBuysUseCase.execute();
        //Then
        Assertions.assertNull(getBuy);

    }
}