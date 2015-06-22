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
public class degree {
    public static void main(String[] args) {
    int k; int n; int degree;
    k=2; n=3; degree=k;
        for (int i=2; i<=n;i++){
            degree*=k;
        }
    System.out.println("The answer is: "+degree);
    }
}
