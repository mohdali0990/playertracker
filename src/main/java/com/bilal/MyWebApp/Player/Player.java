package com.bilal.MyWebApp.Player;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String playerName;

    public Player(int id, String playerName) {
        this.id = id;
        this.playerName = playerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
