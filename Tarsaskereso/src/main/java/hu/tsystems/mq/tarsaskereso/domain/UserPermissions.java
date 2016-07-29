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
public class UserPermissions {
    private int ID;
    private boolean nameShared;
    private boolean friendsShared;
    private boolean ownedGamesShared;
    private boolean favouriteGamesShared;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isNameShared() {
        return nameShared;
    }

    public void setNameShared(boolean nameShared) {
        this.nameShared = nameShared;
    }

    public boolean isFriendsShared() {
        return friendsShared;
    }

    public void setFriendsShared(boolean friendsShared) {
        this.friendsShared = friendsShared;
    }

    public boolean isOwnedGamesShared() {
        return ownedGamesShared;
    }

    public void setOwnedGamesShared(boolean ownedGamesShared) {
        this.ownedGamesShared = ownedGamesShared;
    }

    public boolean isFavouriteGamesShared() {
        return favouriteGamesShared;
    }

    public void setFavouriteGamesShared(boolean favouriteGamesShared) {
        this.favouriteGamesShared = favouriteGamesShared;
    }

    @Override
    public String toString() {
        return "UserPermissions{" + "nameShared=" + nameShared + ", friendsShared=" + friendsShared + ", ownedGamesShared=" + ownedGamesShared + ", favouriteGamesShared=" + favouriteGamesShared + '}';
    }
    
    
    
}
