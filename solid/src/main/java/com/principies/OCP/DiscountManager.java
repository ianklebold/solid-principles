package com.principies.OCP;

public class DiscountManager {

    //Este metodo lo que hace es tomar el precio y aplicarle un descuento
    public Double apply(Double price, Discount discount) {
        return discount.apply(price);
    }

    public Double apply(Double price, GoldDiscount goldDiscount) {
        return goldDiscount.apply(price);
    }

    public Double apply(Double price, BlackFridayDiscount blackFridayDiscount) {
        return blackFridayDiscount.apply(price);
    }
}
