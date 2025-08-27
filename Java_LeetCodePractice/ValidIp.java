import java.util.regex.Pattern;

public class ValidIp {
    static String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    static Pattern pattenIPv4 = Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

    static String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    static Pattern pattenIPv6 = Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

    public static String validIPAddress(String IP) {
        if (pattenIPv4.matcher(IP).matches())
            return "IPv4";
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }
    // public static String validIPAddress(String queryIP) {
    //     String answer = "";
    //     if (queryIP.charAt(3) == '.') {
    //         String[] strArr = queryIP.split(".");
    //         for (String str : strArr) {
    //             System.out.println(str);
    //             if (Integer.parseInt(str) <= 255 && Integer.parseInt(str) >= 0) {
    //                 answer = "IPv4";
    //             } else {
    //                 answer = "Neither";
    //             }
    //         }
    //     } else if (queryIP.indexOf(":") != -1) {
    //         answer = "IPv6";
    //         String[] strArr = queryIP.split(":");
    //     }else{
    //         answer = "Neither";
    //     }

    //     return answer;
    // }

    public static void main(String[] args) {
        System.out.println(validIPAddress("172.16.254.1"));
        System.out.println(validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(validIPAddress("256.256.256.256"));
    }
}
