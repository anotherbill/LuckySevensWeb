/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.luckysevensweb.controller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LuckySevens {

    
    
    public String run(int userPot) {
        String message = "";
        int maxPot = 0;
        int maxPotRoll = 0;
        int dice1 = 0;
        int dice2 = 0;
        int diceTotal = dice1 + dice2;
        int rollNum = 0;
        String sUserPot = "";

        Random rGen = new Random();
        //System.out.println("How many dollars do you want to bet?");
        //Scanner userInput = new Scanner(System.in);
        //sUserPot = userInput.nextLine();
        //userPot = Integer.parseInt(sUserPot);
        while (userPot >= 0) {
            dice1 = rGen.nextInt(7) + 1;
            dice2 = rGen.nextInt(7) + 1;
            rollNum += 1;

            if (dice1 + dice2 == 7) {
                userPot += 4;
            } else {
                userPot -= 1;
            }
            if (userPot > maxPot) {
                maxPot = userPot;
                maxPotRoll = rollNum;
            }

        }
        return message = " You are broke after " + rollNum + " rolls " + 
                "You should have quit after " + maxPotRoll + " rolls when you had $" + maxPot ;
//        System.out.println(" You are broke after " + rollNum + " rolls");
//        System.out.println("You should have quit after " + maxPotRoll + " rolls when you had $" + maxPot);
    }

    public static double promptDouble(String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(message);
        String string = userInput.nextLine();
        return Double.parseDouble(string);

    }

    public static String promptString(String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(message);
        String string = userInput.nextLine();
        return string;

    }

    public static int promptInt(String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(message);
        return userInput.nextInt();
    }
    public String getGameName(){
        return "Lucky Sevens";
    }
}

