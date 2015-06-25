/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import day5WarShips.*;

/**
 *
 * @author Amilo
 */
public class MapEngine {

    int mainMap[][] = new int[10][10];
    int aliveAcounter;

    int ship1 = 4;
    int ship2 = 3;
    int ship3 = 2;
    int ship4 = 1;

    int ship1left = 4;
    int ship2left = 3;
    int ship3left = 2;
    int ship4left = 1;

    int flotCount = 0;
    Ship flot[] = new Ship[10];

    //                    int i, int j
    public boolean placeShip(int y, int x, int direction, int size) {
        System.out.println("Параметры: " + y + "," + x + "," + direction + "," + size);
        //direction: 0-right, 1- down
        //проверка, верно ли заданы входные параметры.
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

        if (size == 1 && ship1 == 0) {
            System.out.println("sizeerror 1 " + ship1);
            return false;
        } else if (size == 2 && ship2 == 0) {
            System.out.println("sizeerror 2 " + ship2);
            return false;
        } else if (size == 3 && ship3 == 0) {
            System.out.println("sizeerror 3 " + ship3);
            return false;
        } else if (size == 4 && ship4 == 0) {
            System.out.println("sizeerror 4 " + ship4);
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
         */
        for (int i = y - 1; i < yend + 2; i++) {
            if (i >= 0 && i < 10) {
                for (int j = x - 1; j < xend + 2; j++) {
                    if (j >= 0 && j < 10) {
                        if (mainMap[i][j] == 1) {
                            return false;
                        }
                    }
                }
            }
        }

        //помечаем всю область 9-ками. одновременно идет проверка выхода 9-ок за границу карты        
        for (int i = y - 1; i < yend + 2; i++) {
            if (i >= 0 && i < 10) {
                for (int j = x - 1; j < xend + 2; j++) {
                    if (j >= 0 && j < 10) {
                        mainMap[i][j] = 9;
                    }
                }
            }
        }

        //помечаем область где должен быть корабль 1-цами
        for (int i = y; i < yend + 1; i++) {
            for (int j = x; j < xend + 1; j++) {
                mainMap[i][j] = 1;
            }
        }

        //выводим карту
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mainMap[i][j] + " ");
            }
            System.out.println("");
        }

        if (size == 1) {
            ship1--;
        } else if (size == 2) {
            ship2--;
        } else if (size == 3) {
            ship3--;
        } else {
            ship4--;
        }

        Ship ship = new Ship(size, y, x, yend, xend);

        flot[flotCount] = ship;
        flotCount++;

        return true;
    }

    /**
     * метод стрельбы получаем координаты и возвращаем результат
     */
    public int placeShot(int y, int x) {
        int result = 0;
        if (mainMap[y][x] == 0 || mainMap[y][x] == 9) {
            mainMap[y][x] = 3;
            result = 0;//мимо если попали в пустое место или если это 9-ка.
        } else if (mainMap[y][x] == 1) {
            mainMap[y][x] = 2;
            int index = findShip(y, x);
            flot[index].alive = isAlive(index);

            if (!flot[index].alive) {

                if (flot[index].size == 1) {
                    ship1left--;
                } else if (flot[index].size == 2) {
                    ship2left--;
                } else if (flot[index].size == 3) {
                    ship3left--;
                } else if (flot[index].size == 4) {
                    ship4left--;
                }

                for (int i = flot[index].y - 1; i < flot[index].yend + 2; i++) {
                    if (i >= 0 && i < 10) {
                        for (int j = flot[index].x - 1; j < flot[index].xend + 2; j++) {
                            if (j >= 0 && j < 10) {
                                mainMap[i][j] = 2;
                            }
                        }
                    }
                }
                result = 8;//убил
            } else {
                result = 1;//Попал!
            }
        } else if (mainMap[y][x] == 2) {
            result = 2;//Попал в уже раненного
        } else if (mainMap[y][x] == 3) {
            result = 3;//Пустое место, уже обстрелянное
        }

        //вывод карты
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mainMap[i][j] + " ");
            }
            System.out.println("");
        }

        if (!keepPlaying()) {
            return 7;
        }
        return result;
    }

    public boolean keepPlaying() {
        for (int i = 0; i < flot.length; i++) {
            if (flot[i].alive) {
                return true;
            }
        }
        return false;
    }

    public int findShip(int y, int x) {
        for (int coordi = 0; coordi < flot.length; coordi++) {
            for (int i = flot[coordi].y; i < flot[coordi].yend + 1; i++) {
                for (int j = flot[coordi].x; j < flot[coordi].xend + 1; j++) {
                    if (y == i && x == j) {
                        return coordi;
                    }
                }
            }
        }
        return -1;
    }

    public boolean isAlive(int index) {
        for (int i = flot[index].y; i < flot[index].yend + 1; i++) {
            for (int j = flot[index].x; j < flot[index].xend + 1; j++) {
                if (mainMap[i][j] == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
