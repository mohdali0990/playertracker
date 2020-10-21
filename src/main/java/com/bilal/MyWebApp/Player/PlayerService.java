package com.bilal.MyWebApp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    List<Player>list= new ArrayList<>();


    public PlayerService() {
        System.out.println("Service layer is working");
        list.add(new Player(1,"bilal"));
        list.add(new Player(2,"faraz"));
        list.add(new Player(3,"saad"));
    }

    //Getting/returning all the players.
    public List<Player>getAllPlayers(){
        return list;
    }

    //Get 1 player using number
    public Player getPlayer(int id) {
        for (Player p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    //Save a player
    public void savePlayer(Player player){
      this.list.add(player);
    }

    //update player
    public void updatePlayer(Player player){
        for (Player p : list) {
            if(p.getId()==player.getId()){
                p.setPlayerName(player.getPlayerName());
            }

        }

    }
    //remove player

    public void deletePlayer(int id){
     list.remove(id);
    }

}
