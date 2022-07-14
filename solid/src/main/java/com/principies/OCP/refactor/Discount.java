package com.principies.OCP.refactor;

public class Discount implements DiscountInterface{
    
    //Descuento para clientes normales
    public Double apply(Double price) {
        return price*0.5;
    }
}
