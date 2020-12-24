package com.company;

public class soal1 {
    public static void main(String[] args){
        for (int i = 1; i <= 4; i++){
            for (int x = 0; x <= 4; x++){
                if (x == 0 || x == 2 || x == 4){
                    System.out.print("X");
                }else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
