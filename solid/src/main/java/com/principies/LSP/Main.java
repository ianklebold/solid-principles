package com.principies.LSP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] aStrings) {
        testCourt();
    }

    public static void testCourt(){
        List<Court> courts = new ArrayList<>();
        courts.add(new WimbledonCourt());
        courts.add(new AustraliaOpenCourt());
        courts.add(new RolandGarrosCourt());

        courts.stream().forEach(c -> c.cutGrass());
    }
}
