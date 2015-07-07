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
public class Otnimalka {

    public static void main(String[] args) {
            System.out.println("Final:"+recus(12303));
    }

    public static int recus(int theNum){
        System.out.println(theNum);
        if (theNum==1){
            return 1;
        }
        return recus(theNum-1);
    }
}
