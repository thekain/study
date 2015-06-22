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
public class Mapv2 {

    int mainMap[][] = new int[10][10];
    int aliveAcounter;

    //                    int i, int j
    public boolean placeShip(int y, int x, int direction, int size) {
        System.out.println("Data: " + y + "," + x + "," + direction + "," + size);
        //direction: 0-right, 1- down
//        проверка, верно ли заданы входные параметры.
        if (x < 0
                || x > 10
                || y < 0
                || y > 10
                || direction < 0
                || direction > 1
                || size < 1
                || size > 4) {
            return false;
        }

        /**
         * определяем конечные координаты корабля в зависимости от направления
         * надо учитывать, что конечные координаты корабля таковыми не являются
         * все расчет у нас идут ДО этого числа, а не равным этому числу. т.е.
         * получая входные параметры 7,1,0,3 мы должны к точке 7 прибавить три
         * палубы. = 10. но фактически кол-во палуб 7,8,9,10 при этом 10 это уже
         * перебор, т.к. у нас массив с 0 до 9. вот и получается, что конечная
         * точка реально на -1 знак раньше.
         *
         */
        int xend = 0;
        int yend = 0;
        if (direction == 0) {
            xend = x + size - 1;
            yend = y;
        } else {
            xend = x;
            yend = y + size - 1;
        }

//      проверяем не выходит ли корабль за границы карты        
        if (xend >= 10 || yend >= 10) {
            return false;
        }

        /**
         * проверка возможно ли размещение корабля надо учитывать, что корабль
         * имеет вокруг себя еще т.н. занятуню зону. и если корабль у нас
         * помещается, это мы уже првоерили, то здесь надо 1) размещая длииный
         * корабль проверить что нет никаких препятствий по всей его длине 2)
         * убедиться, что закрашивая занятую зоны мы не выйдем за пределы карты.
         * 0 - пусто 1 - корабль 9 - занятое пространство 2 - попадание 3 - мимо
         * При старте у нас могут быть только 0 при расстановке кораблей
         * добавляются 1 и 9
         *
         */
        for (int i = y - 1; i < yend + 2; i++) {
            if (i >= 0 && i < 10) {
                for (int j = x - 1; j < xend + 2; j++) {
                    if (j >= 0 && j < 10) {
                        if (mainMap[i][j] != 0) {
                            return false;
                        } else {
                            mainMap[i][j] = 9;
                        }
                    }
                }
            }
        }

        //размещаем корабль
        //System.out.println("debugSP");
        for (int i = y; i < yend+1; i++) {
            for (int j = x; j < xend+1; j++) {
                mainMap[i][j] = 1;
                //System.out.println("debug");
            }
        }

        //помечаем клетки вокруг как занятые 9. При этом определять не выходим ли за границы
        // выводим карту
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mainMap[i][j] + " ");
            }
            System.out.println("");
        }
        return true;
    }

    public int placeShot(int y, int x) {
        return 0;
    }

}
