/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5WarShips;

import javax.swing.JButton;

/**
 *
 * @author Amilo
 */
public class JBExtended {

    JButton button;
    int y;
    int x;
    boolean ioi;
//    SeaBattle seabattle = new SeaBattle();

    public JBExtended() {
    }

    public JBExtended(JButton button, int y, int x) {
        this.button = button;
        this.y = y;
        this.x = x;

        this.button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                System.out.println("" + y + " " + x);
                SeaBattle.getDataBackFromButton(y, x);
                
//                SeaBattle.getDataBackFromButton()
                //SeaBattle.main(args); .whichButtony=y;
                //seabattle.whichButtonx=x;
            }
        }
        );
    }
}