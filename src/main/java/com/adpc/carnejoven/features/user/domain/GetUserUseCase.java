package com.adpc.carnejoven.features.user.domain;

public class GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String nif) {
        return this.userRepository.obtainUser(nif);
    }
}
