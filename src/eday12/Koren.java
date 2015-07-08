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
public class Koren {
    public static void main (String[] args){
        System.out.println(koren(4,2,1));
//        int g = 0;
//        System.out.println(++g);

    }
    
    public static int koren (int x, int y, int s){
        if (x==y){
            return s;
        } 
        
        if ((x%y)!=0){
            return 0;
        }
        
        //System.out.println(s);
        return koren (x/y,y,++s);
    }
}
