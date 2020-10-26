package com.example.calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Вас приветствует калькулятор! \nКакое действие вы хотите совершить?  \n 1. Сложение. \n 2. Вычитание. \n 3. Умножение. \n 4. Деление.");
        int q = scanner.nextInt();

        if (q == 1){
            System.out.println("Вы выбрали сложение.");

        }
        else if (q==2){
            System.out.println("Вы выбрали вычитание.");

        }
        else if (q==3){
            System.out.println("Вы выбрали умножение.");

        }
        else if (q==4){
            System.out.println("Вы выбрали деление.");

        }
        Thread.sleep(1000);

        System.out.println("Введите 2 числа, которые хотите вычислить.");



//        String a = scanner.nextLine();
//
//        System.out.println(a);












    }
}
