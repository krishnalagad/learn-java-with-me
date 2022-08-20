// package StringMethods;

public class StringToCharArray {
    public static void main(String[] args) {
        String rawString = "krishnalagad";
        char[] arr = rawString.toCharArray();

        for (char ch : arr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                continue;
            } else {
                System.out.print(Character.toUpperCase(ch) + " ");
            }
        }
        System.out.println();
        secondMethod("krishnalagad");
        System.out.println();
        thirdMethod("krishnalagad");
    }

    public static void secondMethod(String rawString) {
        char[] arr = new char[rawString.length()];
        for (int i = 0; i < rawString.length(); i++) {
            arr[i] = rawString.charAt(i);
        }

        for (char ch : arr) {
            System.out.print(Character.toUpperCase(ch) + " ");
        }
    }

    public static void thirdMethod(String rawString) {
        System.out.println(rawString.replaceAll("[AEIOUaeiou]", ""));
    }
}
