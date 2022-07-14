package com.principies.OCP;

public class GoldDiscount {
    //Descuento para clientes clase "Gold"
    public Double apply(Double price) {
        return price*0.3;
    }

}
