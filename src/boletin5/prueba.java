package boletin5;

import java.util.HashMap;
import java.util.Scanner;

public class prueba {
    public static int romanToDecimal(String romanNumeral) {
        HashMap<Character, Integer> romanDict = new HashMap<>();
        romanDict.put('M', 1000);
        romanDict.put('D', 500);
        romanDict.put('C', 100);
        romanDict.put('L', 50);
        romanDict.put('X', 10);
        romanDict.put('V', 5);
        romanDict.put('I', 1);

        int decimalNum = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char romanDigit = romanNumeral.charAt(i);
            int value = romanDict.get(romanDigit);
            if (value < prevValue) {
                decimalNum -= value;
            } else {
                decimalNum += value;
            }
            prevValue = value;
        }

        return decimalNum;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero Romano:  ");
        String romanNumeral = teclado.nextLine();
        int decimalNum = romanToDecimal(romanNumeral);
        System.out.println("El número decimal correspondiente es: " + decimalNum);
    }
}
