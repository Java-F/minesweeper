package com.JavaF.minesweeper;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to JAVA-Minesweeper");
        System.out.print("Enter username: ");
        String userName = myObj.nextLine();
        userName = userName.substring(0,1).toUpperCase(Locale.ROOT)+userName.substring(1);
        System.out.printf("Hello %s, please choose what would you like to do\n", userName);

        System.out.println("1 - Start the game");
        System.out.println("2 - Change settings");

        Integer option = myObj.nextInt();
        System.out.println("choosed option: " + option);


        switch (option){
            case 1:
                Board board = new Board();
                board.boardSize = 5; //user interaction
                int size = board.boardSize; //user interaction


                String b[][];

                b = board.createBoard(size);

                for(int i=0; i<board.boardSize;i++){
                        System.out.print("\n");
                    for(int j=0; j<board.boardSize;j++){
                        System.out.print(b[i][j]+' ');
                    }

                }


            case 2:
                //Settings.java
            default:

        }

    }
}
