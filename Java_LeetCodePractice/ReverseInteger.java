class ReverseInteger {
    public static int reverse(int x) {
        int res = 0;
        String str = String.valueOf(x);
        StringBuffer sb = null;

        if (str.startsWith("-")) {
            String raw = str.substring(1);
            sb = new StringBuffer(raw);
            StringBuffer sbN = sb.reverse();
            String str1 = sbN.toString();
            str1 = "-" + str1;
            res = Integer.valueOf(str1);
            return res;
        }

        sb = new StringBuffer(str);
        StringBuffer sbN = sb.reverse();
        String str1 = sbN.toString();

        if (str1.startsWith("0")) {
            if (str1.length() <= 1) {
                return 0;
            }
            String raw = str1.substring(1);
            res = Integer.valueOf(raw);
            return res;
        }
        res = Integer.valueOf(str1);
        if (res > 2147483647 || res < -2147483648)
            return 0;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123456789));
    }
}


// public int reverse(int x) {
    
// 	try {
	
//         String revStr = "";
        
//         // get absoulte value to make the problem easier.
//         int temp = Math.abs(x);
    
//         while(temp > 0) {
//             revStr  = revStr + String.valueOf(temp%10);
//             temp = temp/10;
            
//         }
        
//         int revNum = Integer.parseInt(revStr);
    
//         return x < 0 ? -revNum : revNum;
        
//     }
//     catch(Exception ex) {
//         return 0;
//     }
// }