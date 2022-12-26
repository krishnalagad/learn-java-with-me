public class RegEx4 {
    public static void main(String[] args) {
        String[] strArr = "a1234A2134b1234B3456c6576C4567d8776D4567e67879E4567".split("(?=[A-z])");
        for (String str : strArr) {
            System.out.print(str + " ");
        }
        System.out.println();

        /*
         * Split string from the alphabet starts with any of the A to Z or a to z
         * .Include pattern.
         * Output: a1234 A2134 b1234 B3456 c6576 C4567 d8776 D4567 e67879 E4567
         */
        // -----------------------------------------------------------------------------------

        String[] strArr1 = "Chicago|Indianapolis|Boston|Houston".split("\\|");
        String[] strArr2 = "Krishna$is$my$name".split("\\$");
        for (String str : strArr1) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (String str : strArr2) {
            System.out.print(str + " ");
        }
        System.out.println();
        /*
         * Split string from (|, $) i.e. letter comes after \\. exclude pattern
         * Output: Chicago Indianapolis Boston Houston
         * Krishna is my name
         */
        // -----------------------------------------------------------------------------------

        String[] strArr3 = "KrishnaDilipLagad".split("[aeiouAEIOU]");
        for (String str : strArr3) {
            System.out.print(str + " ");
        }
        System.out.println();
        /*
         * Split string whenever alphabets between [ and ] comes i.e. (a,e,i,o,u
         * ,A,E,I,O,U) , exclude pattern.
         * Output: Kr shn D l pL g d
         */
        // -----------------------------------------------------------------------------------

        String[] strArr4 = "abcdefghijklmnopqru".split("");
        for (String str1 : strArr4) {
            System.out.print(str1 + " ");
        }
        /*
         * Split string into individual alphabet
         * Output: a b c d e f g h i j k l m n o p q r u
         */
        // -----------------------------------------------------------------------------------
    }
}
