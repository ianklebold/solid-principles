package com.principies.LSP;

public class RolandGarrosCourt extends Court{
    
    //El problema con RolandGarros es que no tiene cesped, es de cemento
    @Override
    public void cutGrass() {
        //No hay logica a implementar
        throw new IllegalArgumentException("No hay cesped que cortar");
    }
}
