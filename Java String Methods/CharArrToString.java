
public class CharArrToString {

    public static void main(String[] args) {
        // char[] arr = new char[] {'k', 'r', 'i', 's', 'h', 'n', 'a'};
        String str = "krishna";
        System.out.println("Original Stirng:" + str);

        char[] charArray = str.toCharArray();
        System.out.println("Converted to Char Array: ");
        for(char ch: charArray){
            System.out.print(ch + " ");
        }
        System.out.println();

        String str1 = String.valueOf(charArray, 2, 5);
        System.out.println("Char converted to String with offset: " + str1);

        System.out.println("Substring of " + str + " : " + str.substring(str.lastIndexOf('i'), 5));

        String str2 = "krishna lagad is my name";
        CharSequence subSequence = str2.subSequence(0, str2.lastIndexOf('i'));
        System.out.println(subSequence);

    }
}
