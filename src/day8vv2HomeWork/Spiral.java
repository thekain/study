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
public class Spiral {

    /**
     * for (int i=0;i<3;i++){ for (int j=0;j<3;j++) {
     *
     * }
     * }
     *
     */
    static int arraysize = 5;
    static int array[][] = new int[5][5];
    static int data = 1;
    static int step = 2;
    static int iteration = arraysize - 1;
    static int direction = 1; // 1-down, 2-up
    static int x;
    static int y;

    public static void main(String[] args) {

//        for (int i = 0; i < arraysize; i++) {
//            for (int j = 0; j < arraysize; j++) {
//                array[i][j] = data;
//                data++;
//            }
//        }
//
//        vivod();
        data = 1;
        for (int j = 0; j < arraysize; j++) {
            array[0][j] = data;
            data++;
            y = j;
        }
        vivod();

        go(direction, iteration);
        iteration--;
        direction = 2;
        go(direction, iteration);
        iteration--;
        direction = 1;
        //go(direction, iteration);
        vivod();
    }

    public static void go(int dir, int iter) {
        if (dir == 1) {
            for (int i = x + 1; i < iter; i++) {
                array[i][y] = data;
                data++;
                x = i + 1;
            }
            for (int j = iter; j > -1; j--) {
                array[x][j] = data;
                data++;
                y = j;
            }
        } else if (dir == 2) {
            for (int i = iter; i > 0; i--) {
                array[i][y] = data;
                data++;
                x = i + 1;
            }

            for (int j = y+1; j < iter+1; j++) {
                array[x-1][j] = data;
                data++;
                y = j;
            }

        }
    }

    public static void vivod() {
        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                System.out.print(" " + array[i][j]);

                //System.out.println("j:"+j+" y:"+y+" data:"+data+" dir"+dir);
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
