package com.principies.SRP;

public class Player {
    Long id;
    String name;
    int win;
    int loss;
    String date;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLoss() {
        return loss;
    }
    public void setLoss(int loss) {
        this.loss = loss;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Double winPecentPlayer(Player player){
        return Double.valueOf(player.getWin()/(player.getWin()+player.getLoss()));
    }

    public Double lossPecentPlayer(Player player){
        return Double.valueOf(player.getLoss()/(player.getWin()+player.getLoss()));
    }

    public void savePlayer(Player player){
        //Guarda el player
    }


    public void deletePlayer(Player player){
        //Elimina el player
    }
    

    public void updatePlayer(Player player){
        //Actualiza el player
    }


    public void showPlayerHD(Player player){
        //muestra el player por pantalla
    }

}
