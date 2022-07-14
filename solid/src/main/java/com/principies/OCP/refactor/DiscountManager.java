package com.principies.OCP.refactor;

public class DiscountManager {

    //Este metodo lo que hace es tomar el precio y aplicarle un descuento
    public Double apply(Double price, DiscountInterface discount) {
        return discount.apply(price);
    }
}
