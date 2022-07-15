package com.principies;

public class UserRepository {
    public User getUserById(Long id) {
        
        //Logica para traer el usuario de la base de datos


        User user = new User(1L, "example name", "example@mail.com");
        return user; 
    }
}
