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
    MainInterface mi;
//    SeaBattle seabattle = new SeaBattle();

    public JBExtended() {
    }

    public JBExtended(JButton button, int y, int x, SeaBattle context) {
        this.button = button;
        this.y = y;
        this.x = x;

        this.mi = (MainInterface) context;
        
        this.button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(ioi)return;
                  mi.transporter(y, x);
            }
        }
        );
    }
}