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
public class SimpleRecursion {

    public static void main(String[] args) {
        System.out.println("Result:" + recus(7));
    }

    public static int recus(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = recus(n - 1) * n;
        return result;
    }

}