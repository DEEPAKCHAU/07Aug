package com.deepak.businessgame.model;

public enum BoardCellType {
    J("Jail", 150),
    H("Hotel", 0),
    L("Lottery", 200),
    E("Empty", 0);

    String description;
    int value;

    private BoardCellType(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return this.description;
    }

    public int getValue() {
        return this.value;
    }
}
