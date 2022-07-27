package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        int n = str.length(); // длина строки
        //System.out.println(n);
        int[] intstr = new int[n]; // строка-массив
        //Scanner input = new Scanner(System.in);
        //userStr = input.next();
        for (int i = 0; i < n; i++) {
            intstr[i] = Character.getNumericValue(str.charAt(i));
        }
        int counter = 0;
        int copycounter = 0;
        for (int i = 0; i < n; i++) {
            //if (counter )
            if (intstr[i]==0){
                counter ++;
            }
            else if (counter > copycounter){

                copycounter = counter;
                counter = 0;
            }
            //System.out.println(counter);


        }
        if (counter >= copycounter) {
            copycounter = counter;
        }
        System.out.println(copycounter);
    }
}
