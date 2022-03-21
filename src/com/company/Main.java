package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++){
            System.out.println((24+23+(i-1)*25)+(211%2));
        }
        task48();
        task73();
        task98();
        task123();
        task148();
    }

    /*
    Найти:
    а) произведение всех целых чисел от 8 до 15;
    б) произведение всех целых чисел от а до 20 (значение а вводится с клавиатуры; 1 ≤ а ≤ 20);
    в) произведение всех целых чисел от 1 до b (значение b вводится с клавиатуры; 1 ≤ b ≤ 20);
    г) произведение всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).
    */
    static void task48(){
        //а) произведение всех целых чисел от 8 до 15;
        System.out.println("а) произведение всех целых чисел от 8 до 15;");
        for (int i = 8; i <= 15; i++){
            for (int j = 8; j <= 15; j++){
                System.out.println(i * j);
            }
        }
        //б) произведение всех целых чисел от а до 20 (значение а вводится с клавиатуры; 1 ≤ а ≤ 20);
        Scanner scan = new Scanner(System.in);
        System.out.println("б) произведение всех целых чисел от а до 20 (значение а вводится с клавиатуры; 1 ≤ а ≤ 20);");
        System.out.println("Введите число от 1 до 20:");
        int a = scan.nextInt();
        while (true) {
            if ((20 < a) || (a < 1)) {
                System.out.println("Невверно введено число, попробуйте ещё раз");
                a = scan.nextInt();
            }else if ((a>=1)&&(a<=20)) {
                break;
            }
        }
        for (int i = a; i <= 20; i++){
            for (int j = a; j <= 20; j++){
                System.out.println(i * j);
            }
        }
        //в) произведение всех целых чисел от 1 до b (значение b вводится с клавиатуры; 1 ≤ b ≤ 20);
        System.out.println("в) произведение всех целых чисел от 1 до b (значение b вводится с клавиатуры; 1 ≤ b ≤ 20);");
        int b = scan.nextInt();
        while (true) {
            if ((20 < b) || (b < 1)) {
                System.out.println("Невверно введено число, попробуйте ещё раз");
                a = scan.nextInt();
            }else if ((b>=1)&&(b<=20)){
                break;
            }
        }
        for (int i = b; i >= 1; i--){
            for (int j = b; j >= 1; j--){
                System.out.println(i * j);
            }
        }
        //г) произведение всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).
        System.out.println("г) произведение всех целых чисел от а до b (значения а и b вводятся с клавиатуры; b ≥ а).");
        int a1 = scan.nextInt(), b1 = scan.nextInt();
        while (true) {
            if (b1 < a1) {
                System.out.println("Невверно введеные числа, попробуйте ещё раз");
                a1 = scan.nextInt();
                b1 = scan.nextInt();
            }else if (b1>=a1){
                break;
            }
        }
        for (int i = b; i >= 1; i--){
            for (int j = a; j >= 1; j--){
                System.out.println(i * j);
            }
        }
    }

    /*
    Вычислить сумму 1+(1/1!)+(1/2!)+...+(1/n!), где n!=1*2*3*...*n (значение n вводится с клавиатуры; 1 < n ≤ 10).
     */
    static void task73(){
        System.out.println("Вычислить сумму 1+(1/1!)+(1/2!)+...+(1/n!), где n!=1*2*3*...*n (значение n вводится с клавиатуры; 1 < n ≤ 10).");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float result = 2.0f;
        while (true) {
            if ((10 < n) || (1 > n)) {
                System.out.println("Невверно введено число, попробуйте ещё раз");
                n = scan.nextInt();
            }else if(1 < n){
                break;
            }
        }
        for (int i = 2; i <= n; i++){
            float a = getFactorial(i);
            result = result + (1/a);
        }
        System.out.println("Результат - " + result);
    }

    //Получение факториала
    public static int getFactorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /*
    Известно количество осадков, выпавших за каждый день января и марта. Определить среднедневное количество осадков за каждый месяц.
     */
    static void task98(){
        ArrayList<Integer> Month = new ArrayList<>();
        Random rand = new Random();
        int result = 0;
        for (int i = 0; i < 61; i++){
            Month.add(rand.nextInt(100) + 1);
        }
        for (int i = 0; i < Month.size(); i++){
            if(i <= 30){
                result += Month.get(i);
            }
        }
        System.out.println("Среднее количество осадков в Январе: " + result/30);
        result = 0;
        for (int i = 0; i < Month.size(); i++){
            if(i >= 31){
                result += Month.get(i);
            }
        }
        System.out.println("Среднее количество осадков в Марте: " + result/31);
    }

    /*
    Вычислить сумму кодов всех символов, которые в цикле вводятся с клавиатуры до нажатия клавиши Esc.
    */
    static void task123() throws IOException {
        int result = 0;
        System.out.println("Вводите символы");
        while (true) {
            char a = (char) System.in.read();
            char esc = (char) System.in.read();
            System.out.println((int)a);
            if(esc==70){
                break;
            }
            result += (int)a;
        }
        System.out.println(result);
    }

    /*
    Найти трёхзначные числа abc, все цифры которых различны и удовлетворяют уравнению а^2 – b^2 – с^2 = а – b – с.
     */
    static void task148(){
        Random rand = new Random();
        int a, b, c;
        while(true){
            a = rand.nextInt();
            b = rand.nextInt();
            c = rand.nextInt();
            if(a != b && a != c && b!=c){
                if((a * a - b * b - c * c) == (a - b - c)){
                    System.out.println(a + "²" + " * " + b + "²" + " * " + c + "²" + " = " + a + " - " + b + " - " + c);
                    break;
                }
            }
        }
    }
}
