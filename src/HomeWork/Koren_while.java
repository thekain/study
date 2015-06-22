/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

/**
 *
 * @author Amilo
 */
public class Koren_while {
    public static void main(String[] args){
        double a=64;
        int b=2;
        double c=a;
        while (c%2==0 && c!=b){
           c=a/(b*1.0);
           a=c;
        }           
        if (c==b) {
           System.out.println("good:" + a);
                } else {
           System.out.println("bad:" + c);
        }
    }
}