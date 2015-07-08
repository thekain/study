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
public class CountDigits {

    public static void main(String[] args) {
        int chislo = 222222;
        int kolvo = counter(chislo, 10, 1);
        System.out.println(kolvo);
        int stepen =  step (kolvo);
        System.out.println(summa (chislo, stepen));
    }
    
    public static int step(int x) {
        if (x==1){
            return 10;
        }
        return 10*step(x-1);
    }

    
    public static int counter(int x, int y, int counter) {
        int m = x / y;
        if (m == 0) {
            return counter;
        }
        return counter(x, y * 10, ++counter);
    }

    public static int summa(int x, int y) {
        if (y==1) {
            return x;
        }
        return x/y+summa((x-(x/y)*y),y/10);
    }

}
