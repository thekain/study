/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.Random;

/**
 *
 * @author Amilo
 */
public class diagonal {

    static int arr[][] = new int[7][7];
    static Random rand = new Random();
    static int sum1 = 0;
    static int sum2 = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = rand.nextInt(5);
            }
        }

        vivod();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
                if ((i+j)==6){
                    sum2+=arr[i][j];
                }
            }
        }

        
        System.out.println(""+sum1);
  System.out.println(""+sum2);
//        int step=0;
//        
//        
//        
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 7; j++) {
//                if (i == j) {
//                    sum1 += arr[i][j];
//                }
//            }
//        }

    }

    public static void vivod() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }

}
