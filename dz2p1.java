package ru.geekbrains.java1.Dz2;
public class dz2p1 {
    public static void main(String[] args) {
        int[] arr1 = new int[7];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 0;
        arr1[3] = 1;
        arr1[4] = 0;
        arr1[5] = 1;
        arr1[6] = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i < 7) arr1[i] = Math.abs(arr1[i] -1);
            System.out.println(arr1[i] + " ");
        }
    }
}
//1. Задать целочисленный массив,
// состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

