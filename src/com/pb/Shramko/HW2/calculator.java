package com.pb.Shramko.HW2;

import java.util.Scanner;

class calculator{
    public static void main(String[] args) {
        char operator;
        int operand1, operand2, result;
        Scanner input= new Scanner(System.in);
        System.out.println(" Выберите действие: +, -, *, /");
        operator = input.next().charAt(0);
        System.out.println("Введите первое число");
        operand1 = input.nextInt();
        System.out.println("Введите второе число");
        operand2 = input.nextInt();
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                try {
                    result = operand1/(operand2=0);
                    System.out.println(" result="+result);}
                catch(ArithmeticException e){
                    System.out.println("Деление на ноль запрещенно"+ e.getMessage());}
                break;
        }
    }
}

