package com.deepak.businessgame.model;

import java.util.List;

public class GameBoard {
    private int bankMoney;
    private List<BoardCell> cells;

    public GameBoard() {
    }

    public int getBankMoney() {
        return this.bankMoney;
    }

    public void setBankMoney(int bankMoney) {
        this.bankMoney = bankMoney;
    }

    public List<BoardCell> getCells() {
        return this.cells;
    }

    public void setCells(List<BoardCell> cells) {
        this.cells = cells;
    }
}
