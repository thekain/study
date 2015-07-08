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
public class StrToInt {

    public static void main(String[] args) {
        System.out.println(strtoint("1057"));
    }

    public static int strtoint(String x) {
        if (x.length() == 1) {
            int a= ((int) x.charAt(0))- 48;
//            System.out.println("a"+a+" "+x.charAt(0));
            return a;
        }
        int b = ((int) x.charAt(0)) - 48;
//        System.out.println("b"+b);
        return (b * stepen(x.length() - 1))+strtoint(x.substring(1));
    }

    public static int stepen(int x) {
        if (x == 1) {
            return 10;
        }
        return 10*stepen(x-1);
    }

}
