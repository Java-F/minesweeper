package com.JavaF.minesweeper;

public class Board {

    public int boardSize;
    public int mineAmount;

    public String[][] createBoard(int boardSize){

        String[][] board = new String[boardSize][boardSize];

        for(int i=0; i<boardSize; i++){
            for(int j=0; j<boardSize;j++){

                board[i][j] = "X";
            }
        }
        return board;
    }

}
