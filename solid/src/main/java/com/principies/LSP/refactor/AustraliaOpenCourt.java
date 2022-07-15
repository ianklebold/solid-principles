package com.principies.LSP.refactor;

import com.principies.LSP.refactor.interfaces.HardCourt;

public class AustraliaOpenCourt extends Court implements HardCourt{
    
    @Override
    public void cleanGrass() {
        // TODO Auto-generated method stub
        System.out.println("Limpiando piso");
    }
}
