/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.tsystems.mq.tarsaskereso.domain;

import java.util.Date;

/**
 *
 * @author szabodaniel
 */
public class Event {
    private String ID;
    private User createdBy;
    private Date createdAt;
    private Date startDate;
    private Date endDate;
    private int minimalNumber;
    private int maximalNumber;
    private Game game;
    private boolean publicEvent;
    private GamingNight gamingNight;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getMinimalNumber() {
        return minimalNumber;
    }

    public void setMinimalNumber(int minimalNumber) {
        this.minimalNumber = minimalNumber;
    }

    public int getMaximalNumber() {
        return maximalNumber;
    }

    public void setMaximalNumber(int maximalNumber) {
        this.maximalNumber = maximalNumber;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isPublicEvent() {
        return publicEvent;
    }

    public void setPublicEvent(boolean publicEvent) {
        this.publicEvent = publicEvent;
    }

    public GamingNight getGamingNight() {
        return gamingNight;
    }

    public void setGamingNight(GamingNight gamingNight) {
        this.gamingNight = gamingNight;
    }

    @Override
    public String toString() {
        return "Event{" + "ID=" + ID + ", createdBy=" + createdBy + ", createdAt=" + createdAt + ", startDate=" + startDate + ", endDate=" + endDate + ", minimalNumber=" + minimalNumber + ", maximalNumber=" + maximalNumber + ", game=" + game + ", publicEvent=" + publicEvent + ", gamingNight=" + gamingNight + '}';
    }

    
    
    
    
    
}
