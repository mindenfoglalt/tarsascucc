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
public class Invitation {
    private String ID;
    private User sender;
    private User receiver;
    private String message;
    private Game game;
    private Date sent;
    private boolean accepted;
    private boolean declined;
    private boolean maybe;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isDeclined() {
        return declined;
    }

    public void setDeclined(boolean declined) {
        this.declined = declined;
    }

    public boolean isMaybe() {
        return maybe;
    }

    public void setMaybe(boolean maybe) {
        this.maybe = maybe;
    }

    @Override
    public String toString() {
        return "Invitation{" + "ID=" + ID + ", sender=" + sender + ", receiver=" + receiver + ", message=" + message + ", game=" + game + ", sent=" + sent + ", accepted=" + accepted + ", declined=" + declined + ", maybe=" + maybe + '}';
    }
    
    
}
