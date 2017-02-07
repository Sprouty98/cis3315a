package week2;


import java.util.Scanner;



/**
 *
 * @author Dan
 */
public class number49 {
    public static void main(String[] args) {
            System.out.println("Please enter some text");
         
        Scanner reader = new Scanner(System.in); 
        String input = reader.nextLine(); 
        char[] letters = input.toCharArray(); 
        int count = 0;
        int count2 = 0;
    for (char c : letters) {
        switch (c) {
            case 'a':
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                count++;
        break;
        default:
    }
}
    for (char d : letters) {
    switch (d) {
        case 'b':
        case 'c': 
        case 'd': 
        case 'f': 
        case 'g':
        case 'h':
        case 'j': 
        case 'k': 
        case 'l': 
        case 'm':
        case 'n':
        case 'p': 
        case 'q': 
        case 'r': 
        case 's':
        case 't':
        case 'v':
        case 'x': 
        case 'z': 
            count2++;
    break;
    default:
    }
}
System.out.println("Number of vowels in String [" + input.toLowerCase() + "] is : " + count); 
System.out.println("Number of consonants in String [" + input.toLowerCase() + "] is : " + count2);
    }
    }
