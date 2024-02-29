package com.adpc;

import com.adpc.carnejoven.features.buy.domain.Buy;
import com.adpc.carnejoven.features.buy.presentation.MainBuy;
import com.adpc.carnejoven.features.company.domain.Company;
import com.adpc.carnejoven.features.company.presentation.MainCompany;
import com.adpc.carnejoven.features.promotions.domain.Promotion;
import com.adpc.carnejoven.features.promotions.presentation.MainPromotion;
import com.adpc.carnejoven.features.user.domain.User;
import com.adpc.carnejoven.features.user.presentation.MainUser;


public class Main {
    public static void main(String[] args) {

        Buy buy = new Buy(
                "1",
                "25/02/2024",
                "CompraRealizadaConExito",
                "User1"
        );
        MainBuy.createBuy(buy);
        MainBuy.printBuy();

        Promotion promotion = new Promotion(
                "1",
                "Promotion",
                "PromotionType1",
                "15%"
        );
        MainPromotion.createPromotion(promotion);
        MainPromotion.printPromotion("1");
        MainPromotion.printPromotions();
        MainPromotion.deletePromotion("1");

        Company company = new Company(
                "1",
                "Company1",
                "13456789A"
        );
        MainCompany.createCompany(company);
        MainCompany.printCompany("1");

        User user = new User(
                "123456789A",
                "User1",
                "user1",
                "C/Street,N1"
        );
        MainUser.createUser(user);
        MainUser.printUser("123456789A");

    }
}