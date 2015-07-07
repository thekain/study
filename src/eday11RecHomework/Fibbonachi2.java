/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eday11RecHomework;

/**
 *
 * @author Ohana
 */
public class Fibbonachi2 {

    public static void main(String[] args) {
        for (int i = 1; i < 41; i++) {
            System.out.println("Fib " + i + ": " + recus(i));
        }

    }
    
    public static int recus(int theNum){
        if (theNum==1) {
            return 1;
        }
        if (theNum==2) {
            return 1;
        }
        return recus(theNum-1)+recus(theNum-2);
    }

}
