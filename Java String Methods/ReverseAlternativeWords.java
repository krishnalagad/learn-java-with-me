public class ReverseAlternativeWords {
    public static void printAlternativeReverse(String str) {
        String[] strArr = str.split(" ");
        String result = "";
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 != 0) {
                StringBuffer sb = new StringBuffer(strArr[i]);
                result += String.valueOf(sb.reverse()) + " ";
            } else {
                result += String.valueOf(strArr[i]) + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        printAlternativeReverse("Aakanksha and krishna are very good mates.");
    }
}
