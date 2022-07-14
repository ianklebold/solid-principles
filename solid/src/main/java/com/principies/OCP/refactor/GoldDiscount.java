package com.principies.OCP.refactor;

public class GoldDiscount implements DiscountInterface{
    //Descuento para clientes clase "Gold"
    public Double apply(Double price) {
        return price*0.3;
    }

}
