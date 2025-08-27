public class StringCapitalize {
    public static String capitalizeTitle(String title) {
        String capitalizeWord = "";
        for(String str: title.split("\\s")){
            if (str.length() <=2) {
                capitalizeWord += str.toLowerCase() + " ";
            }else{
                String initial = str.substring(0, 1);
                String afterInitial = str.substring(1);
                capitalizeWord += initial.toUpperCase() + afterInitial.toLowerCase() + " ";
            }
        }
        return capitalizeWord.trim();
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
    }
}
