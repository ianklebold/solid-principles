package com.principies.refactor.factory;

import com.principies.refactor.interfaces.UserRepository;
import com.principies.refactor.LocalUserRepository;

public class UserFactory {

    /**
     * -> Esta clase se encarga de construir el objeto repository por nosotros
     * 
     * -> Puede devolver LocalUserRepostiroy porque justamente esta clase implementa 
     * UserRepository esto le permite devolver LocalUserRepository. 
     *  
     * -> Al devolver LocalUserRepository estamos devolviendo solo
     * Los metodos de local.
     */
    public static UserRepository create() {
        return new LocalUserRepository();
    }
}
