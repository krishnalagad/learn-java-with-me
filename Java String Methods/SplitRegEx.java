// package StringMethods;

public class SplitRegEx {
    public static void main(String[] args) {
        String rawString = "k,r i.s,h.n a l.a,g a.d";
        String regex = "\\s+|,\\s*|\\.\\s*";

        String[] nameParts = rawString.split(regex);
        System.out.println("Length is: " + nameParts.length);

        System.out.println();

        StringBuffer buffer = new StringBuffer();

        for (String name : nameParts) {
            System.out.print(name + " ");
            buffer.append(name);
        }
        System.out.println();
        System.out.println("String Buffer : " + buffer);

        String finalString = buffer.toString();
        System.out.println("Final String : " + finalString);

        System.out.println("Name with space: " + finalString.substring(0, 1).toUpperCase()
                + finalString.substring(1, 7).toLowerCase() + " " + finalString.substring(7, 8).toUpperCase()
                + finalString.substring(8).toLowerCase());

        String str = "abcdefghijklmnopqru";
        String[] strArr = str.split("[aeiouAeiou]");
        for(String str1: strArr){
            System.out.print(str1 + " ");
        }
    }
}
