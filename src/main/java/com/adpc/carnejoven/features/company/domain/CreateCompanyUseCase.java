package com.adpc.carnejoven.features.company.domain;

public class CreateCompanyUseCase {

    private CompanyRepository companyRepository;

    public CreateCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void execute(Company company) {
        this.companyRepository.createCompany(company);
    }
}
