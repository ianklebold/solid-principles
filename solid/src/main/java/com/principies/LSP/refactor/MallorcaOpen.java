package com.principies.LSP.refactor;

import com.principies.LSP.refactor.interfaces.GrassCourt;

public class MallorcaOpen extends Court implements GrassCourt{

    @Override
    public void cutGrass() {
        System.out.println("Cortando cesped de Mallorca Open");
    }
    
}
