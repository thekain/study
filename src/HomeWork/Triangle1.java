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
public class Triangle1 {

    public static void main(String[] args){
        int a, b, c, longest;//Треугольник
        a = 14; c = 6; b = 10; longest = 0;
        //compute the longest side
        if (a>b && a>c){
            Triangle1.message(a, b, c);
        } else if (b>a && b>c){
            Triangle1.message(b, a, c);
        } else {
            Triangle1.message(c, a, c);
        }
    }

    public static void message(int long1, int short1, int short2){
        int longest=long1;
        int shorty1=short1;
        int shorty2=short2;
            if (shorty1+shorty2>longest){
                System.out.println("Yep it will work");
                System.out.println("The longest side is:"+longest);
                System.out.println("The sum of two short are longer:"+(shorty1+shorty2));
            } else {
                System.out.println("Nope. Too short");
                System.out.println("The longest side is:"+longest);
                System.out.println("The sum of two short is less or equal:"+(shorty1+shorty2));

            }
    
    }
}
