package com.principies.OCP;

public class Discount {
    
    //Descuento para clientes normales
    public Double apply(Double price) {
        return price*0.5;
    }
}
