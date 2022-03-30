package com.nik.project;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 4, 0, -1};
        int count = 0; // кол-во ненулевых элементов
        for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    array[count] = array[i];
                    count++;
                }
        }
        for (int i = count; i<array.length; i++){
            array[i] = 0;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
