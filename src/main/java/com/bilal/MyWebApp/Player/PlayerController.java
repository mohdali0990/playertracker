package com.bilal.MyWebApp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value="/players")
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;


    @RequestMapping(value = "/checking")
    public String testing(){
        return"this is working alhumdulilah";
    }


    @GetMapping(path = "/givemealltheplayers")
    public List<Player>allPlayers(){
        return playerService.getAllPlayers();
    }

    @RequestMapping(value = "/players/{id}",method = RequestMethod.GET)
    public Player findPlayer(@PathVariable int id){
        return playerService.getPlayer(id);
    }

    @RequestMapping(value = "/players/saveplayer",method = RequestMethod.POST)
    public void savePlayer(@RequestBody Player player){
        playerService.savePlayer(player);
    }

    @RequestMapping (value = "/players/update",method = RequestMethod.PUT)
    public void updatePlayer(@RequestBody Player player){
        playerService.updatePlayer(player);
    }
    @RequestMapping(value = "/players/delete/{id}",method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable int id){
        playerService.deletePlayer(id);
    }
}
