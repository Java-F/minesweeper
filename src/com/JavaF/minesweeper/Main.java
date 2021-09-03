package com.JavaF.minesweeper;

import com.sun.tools.javac.util.StringUtils;

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
        System.out.printf("Hello %s, please choose what would you like to do", userName);
        System.out.println("1 - Start the game");
        System.out.println("2 - Change settings");

        Integer option = myObj.nextInt();
        System.out.println("choosed option: " + option);
        clear();


        switch (option){
            case 1:
                //
            case 2:
                //

            default:

        }

    }
}
