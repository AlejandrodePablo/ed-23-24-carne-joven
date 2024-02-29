package com.adpc.carnejoven.features.company.data;

import com.adpc.carnejoven.features.company.domain.Company;
import com.adpc.carnejoven.features.company.domain.CompanyRepository;

public class StubCompanyDataRepository implements CompanyRepository {
    @Override
    public void createCompany(Company company) {

    }

    @Override
    public Company obtainCompany(String id) {
        return null;
    }
}
