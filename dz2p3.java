package ru.geekbrains.java1.Dz2;
public class dz2p3 {
    public static void main(String[] args) {
        int[] arr1 = new int[12];
        arr1[0] = 1;
        arr1[1] = 5;
        arr1[2] = 3;
        arr1[3] = 2;
        arr1[4] = 11;
        arr1[5] = 4;
        arr1[6] = 5;
        arr1[7] = 2;
        arr1[8] = 4;
        arr1[9] = 8;
        arr1[10] = 9;
        arr1[11] = 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) arr1[i] = (arr1[i] * 2);
            System.out.println(arr1[i] + " ");
        }
    }

}
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;