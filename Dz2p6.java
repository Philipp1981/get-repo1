package ru.geekbrains.java1.Dz2;
public class Dz2p6 {
    public static boolean checkBalance(int[] array) {
        int leftSum, rightSum;
        for (int i = 0; i < array.length; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}

// ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//         метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
//         массива равны. ​ Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) →
//         false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не
//         входят.