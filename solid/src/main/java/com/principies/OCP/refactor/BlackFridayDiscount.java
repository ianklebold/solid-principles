package com.principies.OCP.refactor;

public class BlackFridayDiscount implements DiscountInterface{

    //Descuento para Black Friday
    public Double apply(Double price) {
        return price*0.4;
    }
}
