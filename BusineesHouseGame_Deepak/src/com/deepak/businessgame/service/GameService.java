package com.deepak.businessgame.service;

import com.deepak.businessgame.model.GameBoard;
import com.deepak.businessgame.model.Player;

import java.util.List;

public interface GameService {
    public GameBoard setupGameBoard(int numberOfCells, int initialMoney);

    public List<Player> setupPlayers(int numberOfPlayer);

    public int playDice(int turn, int playerId);

    public void depositAmoutToBank(GameBoard gameBoard, int amountToDeposit);

    public void withDrawAmountFromBank(GameBoard gameBoard, int amountToWithdraw);
}
