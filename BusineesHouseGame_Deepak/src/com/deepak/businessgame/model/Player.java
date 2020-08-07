package com.deepak.businessgame.model;

import java.util.List;

public class Player {

    private String playerName;
    private int amount;
    private int playerId;
    private int currentCellLocation;
    private List<Hotel> hotels;

    public Player(String playerName, int playerId, int amount, int currentCellLocation, List<Hotel> hotels) {
        this.playerName = playerName;
        this.amount = amount;
        this.currentCellLocation = currentCellLocation;
        this.hotels = hotels;
        this.playerId = playerId;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Hotel> getHotels() {
        return this.hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public int getCurrentCellLocation() {
        return this.currentCellLocation;
    }

    public void setCurrentCellLocation(int currentCellLocation) {
        this.currentCellLocation = currentCellLocation;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
