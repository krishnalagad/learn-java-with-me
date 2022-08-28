public class IntegerToRoman {
    public static String intToRoman(int n) {
        String str = "";
        while (n >= 1000) {
            str = str + "M";
            n -= 1000;
        }
        while (n >= 900 && n < 1000) {
            str = str + "CM";
            n -= 900;
        }
        while (n >= 500 && n < 900) {
            str = str + "D";
            n -= 500;
        }

        while (n >= 400 && n < 500) {
            str = str + "CD";
            n -= 400;
        }
        while (n >= 100 && n < 400) {
            str = str + "C";
            n -= 100;
        }
        while (n >= 90 && n < 100) {
            str = str + "XC";
            n -= 90;
        }
        while (n >= 50 && n < 90) {
            str = str + "L";
            n -= 50;
        }
        while (n >= 40 && n < 50) {
            str = str + "XL";
            n -= 40;
        }

        while (n >= 10 && n < 40) {
            str = str + "X";
            n -= 10;
        }
        while (n >= 9 && n < 10) {
            str = str + "IX";
            n -= 9;
        }
        while (n >= 5 && n < 9) {
            str = str + "V";
            n -= 5;
        }
        while (n >= 4 && n < 5) {
            str = str + "IV";
            n -= 4;
        }
        while (n >= 1 && n < 4) {
            str = str + "I";
            n -= 1;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(21));
    }
}
