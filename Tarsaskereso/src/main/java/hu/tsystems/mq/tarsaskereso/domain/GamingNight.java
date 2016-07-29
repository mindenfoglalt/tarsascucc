/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.tsystems.mq.tarsaskereso.domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author szabodaniel
 */
public class GamingNight {
    private String ID;
    private int numberOfTables;
    private int numberOfRemainingTables;
    private Date startDate;
    private Date endDate;
    private User host;
    private List<Event> events;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public int getNumberOfRemainingTables() {
        return numberOfRemainingTables;
    }

    public void setNumberOfRemainingTables(int numberOfRemainingTables) {
        this.numberOfRemainingTables = numberOfRemainingTables;
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

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    
}
