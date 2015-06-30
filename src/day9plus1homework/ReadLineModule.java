/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9plus1homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author cnp.ak
 */
public class ReadLineModule {
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    static String str;

    public void ReadLineModule() {
        System.out.println("Enter whatever you want:");
        try {str=br.readLine();
        } catch (Exception lalala) {
            lalala.printStackTrace();
        }
    }
}
