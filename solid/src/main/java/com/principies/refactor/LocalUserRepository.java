package com.principies.refactor;

import com.principies.refactor.interfaces.UserRepository;

public class LocalUserRepository implements UserRepository{
    /**
     * En este caso LocalUserRepository implementa como ella sabe
     * Los metodos de la interfaz implementada
     */
    public User getUserById(Long id) {
        
        //Logica para traer el usuario de la base de datos


        User user = new User(1L, "example name", "example@mail.com");
        return user; 
    }
}
