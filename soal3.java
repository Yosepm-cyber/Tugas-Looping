package com.company;

public class soal3 {
    public static void main(String[] args){
        int a = 5;
        for (int i = 1; i <= a; i++){
            for (int j = a; j >= i; j--){
                if (i < 3){
                    System.out.print(i);
            }else
                    System.out.print(3);
            }
            System.out.println();
        }
    }
}