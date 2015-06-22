/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3class;

import java.util.Random;

/**
 *
 * @author Amilo
 */
public class CounterGame {
    int a;
    int b;
    int symbol;
    int result;
    Random rand = new Random();
    String primer;
    
public CounterGame(){
    initGame();
}

    public void initGame () {
        a = rand.nextInt(100);
        b = rand.nextInt(100);
        symbol = rand.nextInt(4);
        //symbol = 4;
        if (b==0 || symbol == 0){
            initGame();
            return;
        }
            
        System.out.println(a+" "+b+" "+symbol);
        /**
         * 1 +
         * 2 - 
         * 3 *
         * 4 /
         */
        if (symbol==1){
        result = a + b;
        primer=(a+"+"+b+"=?");
        } else if (symbol==2){
        result = a - b;
        primer=(a+"-"+b+"=?");
        }  else if (symbol==3){
        result = a * b;
        primer=(a+"*"+b+"=?");
        } else {
        if ((a % b)==0){    
        result = a / b;
        primer=(a+"/"+b+"=?");
        } else {
        int temp = rand.nextInt(15);
        a = b * temp;
        result = a / b;
        primer=(a+"/"+b+"=?");
        }
        }        
    }
}
