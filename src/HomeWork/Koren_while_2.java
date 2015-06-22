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
public class Koren_while_2 {
    public static void main(String[] args){
        double a=125;
        int b=5;
        double c=a;
        int count=1;
        while (c%b==0 && c!=b){
           c=a/(b*1.0);
           a=c;
           count++;
        }           
        if (c==b) {
           System.out.println("good:" + a+" Count: "+count);
                } else {
           System.out.println("bad:" + c);
        }
    }
}