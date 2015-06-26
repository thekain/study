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
    static int step=2;
    static int direction=1; // 1-down, 2-up

    public static void main(String[] args) {

        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                array[i][j] = data;
                data++;
            }
        }

        vivod();

        data = 1;
        for (int i = 0; i < arraysize; i++) {
            array[0][i] = data;
            data++;
        }

        while (data<arraysize*arraysize) {
          //  go();direction
        }
        
        vivod();
    }

    public static void vivod() {
        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void go(int dir){
        if (dir==1) {
            
        } else if (dir==2){
            
        }
    }
}
