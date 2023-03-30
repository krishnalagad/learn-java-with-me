// package StringMethods;

class StringMethods {
    // main method.
    public static void main(String[] args) {

        // 1. charAt(): This method returns a char at the specified index.
        String text = "My name is Krishna Lagad";
        char out = text.charAt(12);
        System.out.println(out);

        // 2. compareTo(): This method compares this String to another Object.
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int out_1 = str1.compareTo(str2);
        System.out.println(out_1);
        out_1 = str2.compareTo(str3);
        System.out.println(out_1);

        // 3. compareToIgnoreCase(): This method returns a negative integer, zero, or a
        // positive integer as the
        // specified String is greater than, equal to, or less than this String,
        // ignoring case considerations.
        out_1 = str1.compareToIgnoreCase(str2);
        System.out.println(out_1);
        out_1 = str2.compareToIgnoreCase(str3);
        System.out.println(out_1);
        out_1 = str3.compareToIgnoreCase(str1);
        System.out.println(out_1);

        // 4. concat(): This method appends one String to the end of another.
        String s1 = "Krishna ";
        String s2 = "Lagad";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // 5. contentEquals(): This method returns true if and only if this String
        // represents the same
        // sequence of characters as specified in StringBuffer.
        str1 = "Krishna Lagad";
        str2 = "Krishna Lagad";
        str3 = "Lagad Krishna";
        StringBuffer buffer = new StringBuffer(str1);
        System.out.println(str2.contentEquals(buffer));
        System.out.println(str3.contentEquals(buffer));

        // 6. copyValueOf(): This method returns a String that represents the character
        // sequence in the array specified.
        char[] arrStr = { 'k', 'r', 'i', 's', 'h', 'n', 'a' };
        String result = "";
        result = String.copyValueOf(arrStr);
        System.out.println(result);

        // 7. endsWith(String suffix): This method tests if this string ends with the
        // specified suffix.
        String Str = new String("This is really not immutable!!");

        System.out.println(Str.endsWith("immutable!!"));
        System.out.println(Str.endsWith("immutable"));

        // 8. equalsIgnoreCase(String anotherString): This method returns true if the
        // argument is not null and the Strings are equal, ignoring case; false
        // otherwise.

        String Str1 = new String("This is really not immutable!!");
        String Str2 = Str1;
        String Str3 = new String("This is really not immutable!!");
        String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");

        System.out.println(Str1.equalsIgnoreCase(Str4));

        // 9. void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) : This
        // method copies characters from this string into the destination character
        // array. It does not return any value but throws IndexOutOfBoundsException.

        String str5 = "welcome to college of engineering";
        char[] charArr = new char[str5.split("").length - 1];
        System.out.println(charArr.length);

        try {
            str5.getChars(5, 20, charArr, 0);
            System.out.println(charArr);

            str5.getChars(0, 5, charArr, 12);
            System.out.println(charArr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
