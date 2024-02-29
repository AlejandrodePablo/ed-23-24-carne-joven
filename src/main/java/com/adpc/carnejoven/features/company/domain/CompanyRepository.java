package com.adpc.carnejoven.features.company.domain;

public interface CompanyRepository {

    void createCompany(Company company);
    Company obtainCompany(String id);
}
