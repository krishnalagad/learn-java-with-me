public class TextEditor {
    public static int editorMiss(String textInput){
        int answer = 0;
        for (int i = 0; i < textInput.length(); i++) {
            if (!Character.isDigit(textInput.charAt(i))
                    && !Character.isLetter(textInput.charAt(i))
                    && !Character.isWhitespace(textInput.charAt(i))) {

                answer += 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(editorMiss("aa a234bc@ sad$ hsagd^"));
    }
}
