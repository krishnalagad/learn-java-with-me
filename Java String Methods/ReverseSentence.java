public class ReverseSentence {
    public static void reverseSentence(String str){
        String[] raw = str.split(" ");
        String result = "";
        for (int i = raw.length; i > 0; i--) {
            result = result +  raw[i] + " ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        reverseSentence("Krishna is my name");
    }
}