package com.adpc.carnejoven.features.company.data;

import com.adpc.carnejoven.features.company.data.local.FileLocalDataSource;
import com.adpc.carnejoven.features.company.domain.Company;
import com.adpc.carnejoven.features.company.domain.CompanyRepository;

import java.util.ArrayList;

public class CompanyDataRepository implements CompanyRepository {

    private static CompanyDataRepository instance = null;

    private CompanyDataRepository() {
    }

    private FileLocalDataSource fileLocalDataSource = new FileLocalDataSource();

    @Override
    public void createCompany(Company company) {
        fileLocalDataSource.save(company);
    }

    @Override
    public Company obtainCompany(String id) {
        return fileLocalDataSource.obtain();
    }

    public static CompanyDataRepository newInstance() {
        if (instance == null) {
            instance = new CompanyDataRepository();
        }
        return instance;
    }

}
