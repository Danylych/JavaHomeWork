package com.pb.Shramko.HW4;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] input)
    {
        String str1, str2;
        int len, len1, len2, i, j, found=0, not_found=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введи первую строку : ");
        str1 = scan.nextLine();
        System.out.print("Введи вторую строку : ");
        str2 = scan.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        if(len1 == len2)
        {
            len = len1;
            for(i=0; i<len; i++)
            {
                found = 0;
                for(j=0; j<len; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    not_found = 1;
                    break;
                }
            }
            if(not_found == 1)
            {
                System.out.print("Не анаграмы");
            }
            else
            {
                System.out.print("Анограмы");
            }
        }
        else
        {
            System.out.print("должны содержать одинаковое количество символов");
        }}}
