/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5WarShips;

import java.util.Random;

/**
 *
 * @author Amilo
 */
public class GameStart {

    Mapv3 myMap = new Mapv3();
    //boolean gameResult=myMap.placeShip(8, 1, 1, 3);
    boolean gameResult;
    Random rand = new Random();
    boolean placeResult;

    public static void main(String[] args) {
        GameStart newGame = new GameStart();
        int success = 10;
        while (success > 0) {
            newGame.printPlacement();
            if (newGame.placeResult == true) {
                success--;
            }
        }
        System.out.println("");
        System.out.println("====================");
        System.out.println("===start shooting=======================================");
        System.out.println("====================");
        System.out.println("");
        for (int i = 0; i < 450; i++) {
            if (newGame.printShoot()) {
                System.out.println("Шаг:" + i);
                break;
            }
        }

    }

    public void printPlacement() {
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int num3 = rand.nextInt(2);
        int num4 = rand.nextInt(5 - 1) + 1;
//        System.out.println("Parameters: " + num1 + "," + num2 + "," + num3 + "," + num4);
        gameResult = myMap.placeShip(num1, num2, num3, num4);
//        gameResult = myMap.placeShip(6,5,1,1);
        if (gameResult == true) {
            System.out.println("Разместил");
            placeResult = true;
        } else {
            System.out.println("Ошибка размещения");
            placeResult = false;
        }
        System.out.println("===================");
    }

    public boolean printShoot() {
        int numy = rand.nextInt(10);
        int numx = rand.nextInt(10);
        int shootResult = myMap.placeShot(numy, numx);
        System.out.println("Коорд Y:" + numy + "; X:" + numx);
        if (shootResult == 0) {
            System.out.println("Мимо");
        }
        if (shootResult == 1) {
            System.out.println("Попадание");
        }
        if (shootResult == 2) {
            System.out.println("УЖЕ Раненный");
        }
        if (shootResult == 3) {
            System.out.println("УЖЕ Мимо");
        }
        if (shootResult == 7) {
            System.out.println("Game Over");
            return true;
        }
        if (shootResult == 8) {
            System.out.println("УБИЛ");
        }
        System.out.println("===================");
        return false;
    }
}
