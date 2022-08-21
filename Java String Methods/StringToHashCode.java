public class StringToHashCode {
    public static void main(String[] args) {
        String str = "Welcome to repository ";
        int hashCode = str.hashCode();      // The hash code for a String object is computed as − 
        System.out.println(hashCode);       // s[0]*31^(n - 1) + s[1]*31^(n - 2) + ... + s[n - 1]

        String a = "100";
        String b = "100";
        System.out.println("Is 'a' and 'b' equal: " + a.equals(b));
        System.out.println("Is their hashcodes equal: ");
        System.out.println(a + " -> " + a.hashCode() + "\t\t" + b + " -> " + b.hashCode());

        int i = 123;
        int hash = Integer.hashCode(i);
        System.out.println(hash);
    }
}
