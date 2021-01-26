package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < n; ++i) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(fibo[i] + " ");
        }
        System.out.println("");
//
        Random random = new Random();
        int x = random.nextInt(n);
        int y = random.nextInt(n);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if (x < y){
            for (int i = x;i<=y;i++){
                sum += fibo[i];
            }
        }else {
            for (int i = x;i>=y;i--){
                sum += fibo[i];
            }
        }
        System.out.println("sum = " + sum);

    }
}
