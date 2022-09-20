public class StringCapitalize {
    public static String capitalizeTitle(String title) {
        String[] strArr = title.split("\\s");
        String capitalizeWord = "";
        for(String str: strArr){
            String initial = str.substring(0, 1);
            String afterInitial = str.substring(1);
            capitalizeWord += initial.toUpperCase() + afterInitial.toLowerCase() + " ";
        }
        return capitalizeWord.trim();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}
