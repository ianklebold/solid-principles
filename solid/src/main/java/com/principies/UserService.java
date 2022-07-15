package com.principies;

public class UserService {
    public void showUser() {
        //Aquí se incumple el principio de inversion de dependencias
        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUserById(1L);

        System.out.println("Email : " + user.getEmail());
    }
}
