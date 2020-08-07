package com.deepak.businessgame.model;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private Player hotelOwner;
    private HotelType hotelType;

    public Hotel(int hotelId, String hotelName, HotelType hotelType) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelType = hotelType;
    }

    public int getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public HotelType getHotelType() {
        return this.hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }

    public Player getHotelOwner() {
        return this.hotelOwner;
    }

    public void setHotelOwner(Player hotelOwner) {
        this.hotelOwner = hotelOwner;
    }

}
