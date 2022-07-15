package com.principies.LSP.refactor;

import com.principies.LSP.refactor.interfaces.GrassCourt;

public class WimbledonCourt extends Court implements GrassCourt{
    
    @Override
    public void cutGrass() {
        //Logica que corta el cesped para el wimbledon
        System.out.println("Cortando el cesped en Wimblodon");
    }
}
