package com.principies.LSP.refactor;

import java.util.ArrayList;
import java.util.List;

import com.principies.LSP.refactor.interfaces.GrassCourt;

public class Main {
    public static void main(String[] aStrings) {
        testCourt();
    }

    public static void testCourt(){
        List<GrassCourt> courts = new ArrayList<>();
        courts.add(new WimbledonCourt());
        courts.add(new MallorcaOpen());

        courts.stream().forEach(c -> c.cutGrass());
    }
}
