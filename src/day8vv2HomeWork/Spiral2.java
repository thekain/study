/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8vv2HomeWork;

/**
 *
 * @author Ohana
 */
public class Spiral2 {

    static int arraysize = 5;
    static int array[][] = new int[5][5];
    static int data = 1;
    static int step = 2;
    static int iteration = arraysize;
    static int direction = 2; // 1-right, 2-down, 3-left, 4-up
    static int x;
    static int y;

    public static void main(String[] args) {
        data = 1;
        for (int j = 0; j < arraysize; j++) {
            array[0][j] = data;
            data++;
            x = j;
        }
        y = 1;
        direction = 2;
        iteration -= 1;

        for (int i = 0; i < 7; i++) {
            System.out.println("x:" + x + " y:" + y + " data:" + data + " iteration:" + iteration + " direction:" + direction);
            go();
            vivod();
        }

    }

    public static void go() {
        if (direction == 1) {
            for (int j = x+1; j < iteration+1; j++) {
                array[y][j] = data;
                data++;
                direction = 2;
                x = j;
            }
            iteration -= 1;
        } else if (direction == 2) {
            for (int i = y; i < iteration+1; i++) {
                array[i][x] = data;
                data++;
                direction = 3;
                y = i;
            }
        } else if (direction == 3) {
            for (int j = x-1; j > -1; j--) {
                array[y][j] = data;
                data++;
                direction = 4;
                x = j;
            }
            iteration -= 1;
        } else if (direction == 4) {
            for (int i = y-1; i > 0; i--) {
                array[i][0] = data;
                data++;
                direction = 1;
                y = i;
            }
        }
    }

    public static void vivod() {
        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
