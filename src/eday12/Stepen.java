/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eday12;

/**
 *
 * @author Amilo
 */
public class Stepen {
    public static void main (String[] args){
        System.out.println(stepen(5,2));
    }
    
    public static int stepen (int x, int y){
        if (y==1){
            return x;
        }
        return x * stepen (x,y-1);
    }
}
