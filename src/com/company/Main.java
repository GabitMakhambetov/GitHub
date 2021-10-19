package com.company;

import java.util.Scanner;
import java.lang.Math;

//Алғашқы 100 жай бөлшектерді табыңыз (жай бөлшек - натурал сан, онда екі түрлі натурал бөлгіш бар: бір және өзі).

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = 0;
        boolean n_ch = false;
        for (int i = 2; n < 100; i++) {
            if (i == 2){
                n++;
                System.out.println(n + " " + i);
            }else {
                for (int j = 2; j < i; j++) {
                    if (i % j != 0) {
                        n_ch = true;
                    } else {
                        n_ch = false;
                        break;
                    }
                }
                if (n_ch == true) {
                    n++;
                    System.out.println(n + " - " + i);
                }
            }
        }
    }
}