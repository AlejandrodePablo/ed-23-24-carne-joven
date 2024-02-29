package com.adpc.carnejoven.features.user.presentation;

import com.adpc.carnejoven.features.user.data.UserDataRepository;
import com.adpc.carnejoven.features.user.domain.CreateUserUseCase;
import com.adpc.carnejoven.features.user.domain.GetUserUseCase;
import com.adpc.carnejoven.features.user.domain.User;

public class MainUser {

    public static void createUser(User user) {
        UserDataRepository userDataRepository = UserDataRepository.newInstance();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userDataRepository);
        createUserUseCase.execute(user);
    }

    public static void printUser(String nif) {
        GetUserUseCase getUserUseCase = new GetUserUseCase(UserDataRepository.newInstance());
        User user = getUserUseCase.execute(nif);
        System.out.println(user.toString());
    }
}
