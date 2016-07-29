/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.tsystems.mq.tarsaskereso.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author szabodaniel
 */
public class User {
    private String ID;
    private String username;
    private String name;
    private String password;
    private String email;
    private List<Game> ownedGames;
    private List<User> friends;
    private Role role;
    private List<Game> favourites;
    private UserPermissions permissions;
    private ArrayList<Invitation> invitations;
    private List<Event> myEvents;


    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", username=" + username + ", name=" + name + ", password=" + password + ", email=" + email + '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Game> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(List<Game> ownedGames) {
        this.ownedGames = ownedGames;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Game> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Game> favourites) {
        this.favourites = favourites;
    }

    public UserPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(UserPermissions permissions) {
        this.permissions = permissions;
    }

    public ArrayList<Invitation> getInvitations() {
        return invitations;
    }

    public void setInvitations(ArrayList<Invitation> invitations) {
        this.invitations = invitations;
    }

    public List<Event> getMyEvents() {
        return myEvents;
    }

    public void setMyEvents(List<Event> myEvents) {
        this.myEvents = myEvents;
    }
    
    
    
    
    
    
    
    
}
