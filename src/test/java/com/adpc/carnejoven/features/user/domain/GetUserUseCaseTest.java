package com.adpc.carnejoven.features.user.domain;

import com.adpc.carnejoven.features.user.data.StubUserDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetUserUseCaseTest {

    private GetUserUseCase getUserUseCase;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getUserUseCase = null;
    }

    @Test
    public void siLaListaEstaVaciaEntoncesNoMuestraNada() {
        //Given:
        getUserUseCase = new GetUserUseCase(
                new StubUserDataRepository()
        );
        //When
        User getUser = getUserUseCase.execute("123456789A");

        //Then
        Assertions.assertNull(getUser);
    }
}