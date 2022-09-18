public class AsciiToChar {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            String str = "Krishnalagadismyname";
            byte[] bytes = str.getBytes("UTF-8");
            for (byte bt : bytes) {
                System.out.print((char) bt);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
