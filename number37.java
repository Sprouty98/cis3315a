/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Dan
 */
public class number37 {
    public static String format(int num, int width) {
        String string = "" + num;
        if (string.length() < width) {
            int numZeros = width - string.length();
            for (int i = 0; i < numZeros; i++) {
                string = "0" + string;
            }
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number and the width to display: ");
        int num = sc.nextInt();
        int width = sc.nextInt();
        System.out.println(format(num, width));
    }
}
