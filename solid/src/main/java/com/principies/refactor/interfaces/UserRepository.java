package com.principies.refactor.interfaces;

import com.principies.refactor.User;

public interface UserRepository {
    /**
     * Este tiene todos los metodos posibles
     * GetUserById, GetAllUser, etc
     * 
     * Esta interfaz le permite implementar a cualquier Repository
     * Los metodos firmados .
     */
    public User getUserById(Long id);
}
