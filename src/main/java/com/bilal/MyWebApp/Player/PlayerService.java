package com.bilal.MyWebApp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;


    public PlayerService() {
    }

    //Getting/returning all the players.

    public List<Player> getAllPlayers(){

        List<Player> playerList=new ArrayList<>();
        playerRepository.findAll().forEach(playerList::add);
        return playerList;
    }

    //Get 1 player using number
    public Player getPlayer(int id) {
        Optional<Player>optionalPlayer= playerRepository.findById(id);
        playerRepository.findById(id);
        if(optionalPlayer.isPresent()) {
            return optionalPlayer.get();
        }
        return null;
    }

    //Save a player
    public void savePlayer(Player player){
        playerRepository.save(player);
    }

    //update player
    public void updatePlayer(Player player){
       playerRepository.save(player);
        }


    //remove player
    public void deletePlayer(int id){
     playerRepository.deleteById(id);
    }

   }


