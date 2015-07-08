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
public class Easy {

    public static void main(String[] args) {
        System.out.println(symbol("iuauiuyuihasbdhjvjhgv","i"));
    }

    public static int symbol(String x, String y) {
        if (x.length() == 1) {
            if (x.equals(y)) {
                return 1;
            } 
            return 0;
        }

        if (y.equals(x.charAt(0)+"")) {
            return 1+symbol(x.substring(1),y);
        } 
        
        return 0+symbol(x.substring(1),y);
    }
}
