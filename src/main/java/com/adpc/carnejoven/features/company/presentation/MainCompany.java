package com.adpc.carnejoven.features.company.presentation;

import com.adpc.carnejoven.features.company.data.CompanyDataRepository;
import com.adpc.carnejoven.features.company.domain.Company;
import com.adpc.carnejoven.features.company.domain.CreateCompanyUseCase;
import com.adpc.carnejoven.features.company.domain.GetCompanyUseCase;

public class MainCompany {

    public static void createCompany(Company company) {
        CompanyDataRepository companyDataRepository = CompanyDataRepository.newInstance();
        CreateCompanyUseCase createCompanyUseCase = new CreateCompanyUseCase(companyDataRepository);
        createCompanyUseCase.execute(company);
    }

    public static void printCompany(String id) {
        GetCompanyUseCase getCompanyUseCase = new GetCompanyUseCase(CompanyDataRepository.newInstance());
        Company company = getCompanyUseCase.execute(id);
        System.out.println(company.toString());

    }
}
