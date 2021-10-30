package com.pb.Shramko.HW4;
import java.util.Scanner;

public class capitallatter {
    private static String keklol(String input) {
        String [] tmpArr = input.split(" ");
        String result = "";
        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i].length() > 1) {
                char oldFirst = tmpArr[i].charAt(0);
                result += tmpArr[i].substring(0,1).toUpperCase() + tmpArr[i].substring(1,tmpArr[i].length()) + " ";
            }
        }
        return result;
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВЕСТИ ПРЕДЛОЖЕНИЕ: ");
        String ss = scanner.nextLine();
        System.out.println(keklol(ss));}}