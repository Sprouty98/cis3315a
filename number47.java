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
public class number47 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first 12 digits of an ISBN-13 string: ");
        String s = sc.nextLine();

        if (s.length() == 12) {
            int sum = 0;
            int checksum = 0;
            for (int i = 1; i <= 12; i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(s.substring(i - 1, i));
                } else {
                    sum += Integer.parseInt(s.substring(i - 1, i));
                }
            }
            checksum = 10 - sum % 10;
            if (checksum == 10) {
                checksum = 0;
            }
            System.out.println("The ISBN number is " + s + checksum);
        } else {
            System.out.println(s + " is invalid input");
        }
    }
}
