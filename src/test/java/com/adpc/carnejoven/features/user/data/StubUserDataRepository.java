package com.adpc.carnejoven.features.user.data;

import com.adpc.carnejoven.features.user.domain.User;
import com.adpc.carnejoven.features.user.domain.UserRepository;

public class StubUserDataRepository implements UserRepository {
    @Override
    public void createUser(User user) {

    }

    @Override
    public User obtainUser(String nif) {
        return null;
    }
}
