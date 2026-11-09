package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Dogru sayiniz: ");
        Scanner giris = new Scanner(System.in);
        float dogru = giris.nextByte();
        System.out.println("Yanlis sayiniz: ");
        float yanlis = giris.nextByte();
        float bos = 20 - (dogru + yanlis);
        float net = dogru-yanlis/4;
        if (dogru > 20 || yanlis > 20 || (dogru + yanlis) > 20 || dogru < 0 || yanlis < 0) {
            System.out.println("Gecersiz veri tespit edilmistir sistem kendini 5 saniye icinde imha edecektir");
            System.out.println("5");
            System.out.println("4");
            System.out.println("3");
            System.out.println("2");
            System.out.println("1");
            System.out.println("Bommmmmmmm");
        } else {
            if (net < 0) {
                System.out.println("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " Netin o kadar kotu ki eksi nete sahipsin");
            } else {
                if ( net < 6) {
                    System.out.println("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " netlerin gelistirilmeli");
                } else {
                    if (net > 5 && net < 11) {
                        System.out.println("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " netlerin orta");
                    } else {
                        if (net > 10 && net < 16) {
                            System.out.println("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " netlerin iyi");
                        } else {
                            System.out.println("net sayisi: " + net + "  dogru sayisi: " + dogru + "  yanlis sayisi: " + yanlis + "  bos sayisi: " + bos + " netlerin cok iyi");
                        }
                    }
                }

            }

        }
    }
}
