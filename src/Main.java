import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  IOException{

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(calc(input));

    }

    public static String calc(String input) throws IOException {

        String result;

        String[] importStructure = input.split(" ");
        if (importStructure.length != 3) {
            throw new IOException();
        }

        String value1 = importStructure[0];
        String value2 = importStructure[2];

        int operator1;
        int operator2;
        boolean convertToRoman = false;
        boolean value1IsRoman = valueIsRoman(value1);
        boolean value2IsRoman = valueIsRoman(value2);
        if(value1IsRoman & value2IsRoman) {
            convertToRoman = true;
            operator1 = intFromRoman(value1);
            operator2 = intFromRoman(value2);
        } else if (value1IsRoman & !value2IsRoman) {
            throw new IOException();
        } else if (!value1IsRoman & value2IsRoman) {
            throw new IOException();
        } else {
            operator1 = Integer.parseInt(value1);
            operator2 = Integer.parseInt(value2);
        }

        if ((operator1 < 1 || operator1 > 10 ) || (operator2 < 1 || operator2 > 10)) {
            throw new IOException();
        }

        int intResult;
        String symbol = importStructure[1];
        switch (symbol){
            case "+":
                intResult = operator1 + operator2;
                break;
            case "-":
                intResult = operator1 - operator2;
                break;
            case "*":
                intResult = operator1 * operator2;
                break;
            case "/":
                intResult = operator1 / operator2;
                break;
            default:
                throw new IOException();
        }

        if (convertToRoman) {
            result = convertToRoman(intResult);
        } else {
            result = Integer.toString(intResult);
        }

        return result;

    }

    public static boolean valueIsRoman (String value) {

        boolean result = false;

        if(value.equals("I")
                | value.equals("II")
                | value.equals("III")
                | value.equals("IV")
                | value.equals("V")
                | value.equals("VI")
                | value.equals("VII")
                | value.equals("VIII")
                | value.equals("IX")
                | value.equals("X")) {

            result = true;

        }

        return  result;

    }

    public static int intFromRoman(String value) throws IOException{

        int result;

        switch (value) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
            default:
                throw new IOException();
        }

        return result;

    }

    public static String convertToRoman(int value) throws IOException{

        String result;


        switch (value) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            case 11:
                result = "XI";
                break;
            case 12:
                result = "XII";
                break;
            case 13:
                result = "XIII";
                break;
            case 14:
                result = "XIV";
                break;
            case 15:
                result = "XV";
                break;
            case 16:
                result = "XVI";
                break;
            case 17:
                result = "XVII";
                break;
            case 18:
                result = "XVIII";
                break;
            case 19:
                result = "XIX";
                break;
            case 20:
                result = "XX";
                break;
            default:
                throw new IOException();
        }

        return result;

    }

}
