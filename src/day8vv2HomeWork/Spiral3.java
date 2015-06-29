/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8vv2HomeWork;

import java.util.Scanner;

/**
 *
 * @author cnp.ak
 */
public class Spiral3 {

    static int sizeX = 10;
    static int sizeY = 10;
    static int Summ = sizeX * sizeY;
    static int CorrectY = 0;
    static int CorrectX = 0;
    static int Count = 1;
    static int Mas[][] = new int[10][10];

    public static void main(String[] arg) {
        while (sizeY > 0) {
            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < ((sizeX < sizeY) ? sizeY : sizeX); x++) {
                    if (y == 0 && x < sizeX - CorrectX && Count <= Summ) {
                        Mas[y + CorrectY][x + CorrectX] = Count++;
                    }
                    if (y == 1 && x < sizeY - CorrectY && x != 0 && Count <= Summ) {
                        Mas[x + CorrectY][sizeX - 1] = Count++;
                    }
                    if (y == 2 && x < sizeX - CorrectX && x != 0 && Count <= Summ) {
                        Mas[sizeY - 1][sizeX - (x + 1)] = Count++;
                    }
                    if (y == 3 && x < sizeY - (CorrectY + 1) && x != 0 && Count <= Summ) {
                        Mas[sizeY - (x + 1)][CorrectY] = Count++;
                    }
                }
            }
            sizeY--;
            sizeX--;
            CorrectY += 1;
            CorrectX += 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + Mas[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
