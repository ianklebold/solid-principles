package com.principies.refactor;

import com.principies.refactor.factory.UserFactory;
import com.principies.refactor.interfaces.UserRepository;

public class UserService {
    public void showUser() {
        //Aquí se incumple el principio de inversion de dependencias
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUserById(1L);

        System.out.println("Email : " + user.getEmail());
    }
}
