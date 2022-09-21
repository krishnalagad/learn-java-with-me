public class ValidIp {
    public static String validIPAddress(String queryIP) {
        String answer = "";
        if (queryIP.charAt(3) == '.') {
            String[] strArr = queryIP.split(".");
            for (String str : strArr) {
                System.out.println(str);
                if (Integer.parseInt(str) <= 255 && Integer.parseInt(str) >= 0) {
                    answer = "IPv4";
                } else {
                    answer = "Neither";
                }
            }
        } else if (queryIP.indexOf(":") != -1) {
            answer = "IPv6";
            String[] strArr = queryIP.split(":");
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(validIPAddress("172.16.254.1"));
        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(validIPAddress("256.256.256.256"));
    }
}
