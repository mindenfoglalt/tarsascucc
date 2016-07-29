/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.tsystems.mq.tarsaskereso.domain;

/**
 *
 * @author szabodaniel
 */
public class Game {
    private String ID;
    private String name;
    private String bggID;
    private String minimumPlayers;
    private String maximumPlayers;


    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", bggID=" + bggID + ", minimumPlayers=" + minimumPlayers + ", maximumPlayers=" + maximumPlayers + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBggID() {
        return bggID;
    }

    public void setBggID(String bggID) {
        this.bggID = bggID;
    }

    public String getMinimumPlayers() {
        return minimumPlayers;
    }

    public void setMinimumPlayers(String minimumPlayers) {
        this.minimumPlayers = minimumPlayers;
    }

    public String getMaximumPlayers() {
        return maximumPlayers;
    }

    public void setMaximumPlayers(String maximumPlayers) {
        this.maximumPlayers = maximumPlayers;
    }
    
    
    
}
