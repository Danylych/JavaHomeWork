package com.pb.Shramko.HW2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner input= new Scanner(System.in);
        System.out.println("Введите число");
        x = input.nextInt();
        if (x>=0 && x<=14) {
            System.out.print("Находиться в промежутке чисел от 0 до 15");
        }
        else if (x>=15 && x<=35){
                System.out.print("Находиться в промежутке чисел от 14 до 35");
        }
        else if (x>=36 && x<=50){
            System.out.println("Находиться в промежутке чисел от 36 до 50");
        }
        else if (x>=51 && x<=100){
            System.out.println("Находиться в промежутке чисел от 51 до 100");
        }
    }}