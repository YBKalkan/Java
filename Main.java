package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner klavye = new Scanner(System.in);
                double yaricap;
                double alan;
                System.out.println("Çenberin Yarıçapını Giriniz: ");

                yaricap = klavye.nextInt();
                alan = yaricap * yaricap * 3.14;
                System.out.println("Çenberin Alanı: " + alan);
            }
        }

