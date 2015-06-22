/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5WarShips;

/**
 *
 * @author Amilo
 */
public class Ship {
    int size;
    boolean alive=true;
    int x;
    int y;
    int xend;
    int yend;
    
    public Ship(){
        size=1;
        x=0;
        y=0;
        xend=0;
        yend=0;    
    }
    
    public Ship(int size, int y, int x, int yend, int xend){
        this.size=size;
        this.x=x;
        this.y=y;
        this.xend=xend;
        this.yend=yend;
    }
}

