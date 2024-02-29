package com.adpc.carnejoven.features.user.data;

import com.adpc.carnejoven.features.user.data.local.FileLocalDataSource;
import com.adpc.carnejoven.features.user.domain.User;
import com.adpc.carnejoven.features.user.domain.UserRepository;


public class UserDataRepository implements UserRepository {

    private FileLocalDataSource fileLocalDataSource = new FileLocalDataSource();
    private static UserDataRepository instance = null;

    private UserDataRepository() {

    }

    public static UserDataRepository newInstance() {
        if (instance == null) {
            instance = new UserDataRepository();
        }
        return instance;
    }

    @Override
    public void createUser(User user) {
        fileLocalDataSource.save(user);
    }

    @Override
    public User obtainUser(String nif) {
        return fileLocalDataSource.obtain();
    }
}
