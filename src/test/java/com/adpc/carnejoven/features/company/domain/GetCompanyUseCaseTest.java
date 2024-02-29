package com.adpc.carnejoven.features.company.domain;

import com.adpc.carnejoven.features.company.data.StubCompanyDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetCompanyUseCaseTest {

    private GetCompanyUseCase getCompanyUseCase;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        getCompanyUseCase = null;
    }

    @Test
    public void siLaListaEstaVaciaEntoncesNoDevuelveNada(){
        //Given
        getCompanyUseCase = new GetCompanyUseCase(
                new StubCompanyDataRepository()
        );
        //When
        Company getCompany = getCompanyUseCase.execute("1");
        //Then
        Assertions.assertNull(getCompany);
    }
}