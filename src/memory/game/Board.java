/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

/**
 *
 * @author Ev0gamer
 */
public class Board {
    
    private int[][] size;
    private boolean emptyBoard;
    private int cardAmount;
    private int currentCardAmount;
    private int points;
    
    public Board (int xMax, int yMax, int pCardAmount)
    {
        size = new int [xMax][yMax];
        emptyBoard = false;
        cardAmount = pCardAmount;
        currentCardAmount = cardAmount;
        points = 0;
    }

    public int[][] getSize() {
        return size;
    }

    public boolean isEmptyBoard() {
        return emptyBoard;
    }

    public int getCardAmount() {
        return cardAmount;
    }

    public int getCurrentCardAmount() {
        return currentCardAmount;
    }

    public int getPoints() {
        return points;
    }

    public void setEmptyBoard(boolean emptyBoard) {
        this.emptyBoard = emptyBoard;
    }

    public void setCurrentCardAmount(int currentCardAmount) {
        this.currentCardAmount = currentCardAmount;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    
}
