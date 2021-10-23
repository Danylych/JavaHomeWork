package com.pb.Shramko.HW3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число.");
        System.out.println("Для выхода из программы введите (-1)");

        final int MAX_ATTEMPT = 101;
        int attempt = 0;

        Scanner in = new Scanner(System.in);
        int x;
        int y = (int) ( Math.random() * 100 );
        int z=(-1);




        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            System.out.println("Введите число");
            x= in.nextInt();

            if (x==z){
                System.out.println("Пока-пока");
                break;}
            if (x<y){
                System.out.println("Мое число больше твоего ");
            }
            if (x>y){
                System.out.println("Моё число меньше твоего");
            }


            if(x!=y){continue;}
                System.out.println("Ты угадал с"+ attempt + " попытки!");
                break;
    }}}