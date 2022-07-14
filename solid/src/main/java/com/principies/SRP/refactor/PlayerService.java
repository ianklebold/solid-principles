package com.principies.SRP.refactor;

import com.principies.SRP.Player;

public class PlayerService {
    
    public Double winPecentPlayer(Player player){
        return Double.valueOf(player.getWin()/(player.getWin()+player.getLoss()));
    }

    public Double lossPecentPlayer(Player player){
        return Double.valueOf(player.getLoss()/(player.getWin()+player.getLoss()));
    }
}
