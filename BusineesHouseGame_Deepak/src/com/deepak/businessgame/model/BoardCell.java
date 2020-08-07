package com.deepak.businessgame.model;

public class BoardCell {
    private BoardCellType cellType;
    private Hotel hotel;

    public BoardCell(BoardCellType cellType, Hotel hotel) {
        this.cellType = cellType;
        this.hotel = hotel;
    }

    public BoardCell(BoardCellType cellType) {
        this.cellType = cellType;
    }

    public BoardCellType getCellType() {
        return this.cellType;
    }

    public void setCellType(BoardCellType cellType) {
        this.cellType = cellType;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}
