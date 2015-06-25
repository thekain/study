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
    public static void main(String[] args) {
        int arraysize = 5;
        int array[][] = new int[5][5];
        int data = 1;

        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                array[i][j] = data;
                data++;
            }
        }

        for (int i = 0; i < arraysize; i++) {
            for (int j = 0; j < arraysize; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }

        
        
        
        
        
    }
}
