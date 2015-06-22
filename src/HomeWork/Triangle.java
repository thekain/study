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
public class Triangle {

    public static void main(String[] args){
        int a, b, c;//Треугольник
        a = 111; c = 4; b = 10;
        //compute the longest side
        if (a>b && a>c){
            if (b+c>a){
                System.out.println("Yep it will work");
            } else {
                System.out.println("Nope. Too short");
            }
        } else if (b>a && b>c){
            if (a+c>b){
                System.out.println("Yep it will work");
            } else {
                System.out.println("Nope. Too short");
            }
        } else {
            if (a+b>c){
                System.out.println("Yep it will work");
            } else {
                System.out.println("Nope. Too short");
            }
        }
    }
}
