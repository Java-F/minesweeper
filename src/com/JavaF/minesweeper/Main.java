package com.JavaF.minesweeper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to JAVA-Minesweeper");
        System.out.println("Enter username: ");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        System.out.println("Please choose what would you like to do");
        System.out.println("1 - Start the game");
        System.out.println("2 - Change settings");

        Integer option = myObj.nextInt();
        System.out.println("choosed option: " + option);

    }
}
