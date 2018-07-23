package ru.geekbrains.java1.Dz2;
public class dz2p5 {
    public static void main(String[] args) {
        int[] arr2 = {1,0,3,4,50};
        int max=arr2[0];
        int min=arr2[0];
        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] > max) {
//                max = arr2[i];
//            }
//            if (arr2[i] < min) {
//                min = arr2[i];
//            }
//        }
            min = Math.min(min, arr2[i]);
            max = Math.max(max, arr2[i]);
            if (arr2[i] < min) min = arr2[i];
            if (arr2[i] > max) max = arr2[i];
        }
            System.out.println(min);
        System.out.println(max);
 //       System.out.println("\n");
        }
    }


//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);