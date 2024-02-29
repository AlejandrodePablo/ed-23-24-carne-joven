package com.adpc.carnejoven.features.user.domain;

public interface UserRepository {

    void createUser(User user);

    User obtainUser(String nif);
}
