package com.pb.Shramko.HW3;

import java.util.Scanner;


public class array {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Введите 10чисел:");
        for (int i=0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }
        //вівести на екран массив
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
}