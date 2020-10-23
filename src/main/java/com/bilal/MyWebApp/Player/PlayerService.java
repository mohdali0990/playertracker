package com.bilal.MyWebApp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    List<Player>list= new ArrayList<>();


    public PlayerService() {
    }

    //Getting/returning all the players.
    public List<Player>getAllPlayers(){
        List<Player>playerList=new ArrayList<>();
        playerRepository.findAll().forEach(playerList::add);
        return playerList;
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

       playerRepository.save(player);
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
     playerRepository.deleteById(id);
    }

}
