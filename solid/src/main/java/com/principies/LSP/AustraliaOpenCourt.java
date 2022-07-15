package com.principies.LSP;

public class AustraliaOpenCourt extends Court{
    
     //El problema con el AustraliaOpen es que no tiene cesped, su piso es duro
    @Override
    public void cutGrass() {
        // TODO Auto-generated method stub
        throw new IllegalArgumentException("No hay cesped que cortar");
    }
}
