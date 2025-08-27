public class CapitalizeWord {
    private static String makeCapitalize(String str) {
        String[] strArr = str.split(" ");
        String result = "";
        for (String s : strArr) {
            if (s.length() == 1)
                result += Character.toLowerCase(s.charAt(0)) + " ";
            else if (s.length() == 2)
                result += s.toLowerCase() + " ";
            else {
                String cap = s.substring(0, 1).toUpperCase();
                String small = s.substring(1).toLowerCase();
                result += cap + small + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String result = makeCapitalize("My name iS kriSHNa");
        System.out.println(result);
    }
}
