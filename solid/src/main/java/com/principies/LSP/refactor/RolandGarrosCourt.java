package com.principies.LSP.refactor;

import com.principies.LSP.refactor.interfaces.ClayCourt;

public class RolandGarrosCourt extends Court implements ClayCourt{

    @Override
    public void clayGrass() {
        System.out.println("Pintando piso");
    }
    
}
