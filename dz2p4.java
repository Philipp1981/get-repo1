package ru.geekbrains.java1.Dz2;
import java.sql.SQLOutput;

//import java.util.Arrays;
public class dz2p4 {
    public static void main(String[] args) {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }
        for (int[] aTable : table) {
            for (int item : aTable) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}





//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;