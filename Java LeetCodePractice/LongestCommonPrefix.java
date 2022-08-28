public class LongestCommonPrefix {
    /**
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) 
            return "";
        
        int length = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());

            for(int j = 0; j < length; j++){
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);

                if(c != d){
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, length);
        
        // int flag = 0;
        // int start = 0;
        // int dest = 1;
        // int index = -1;
        // int k = 0;
        
        // for (int i = 0; i < strs.length; i++) {
        //     String beg = strs[i].substring(start, dest);
        //     // char beg = strs[0].charAt(start);
        //     if (String.valueOf(strs[i].charAt(k)) == beg) {
        //         index += 1;
        //         start = i + 1;
        //         dest = i + 1;
        //         flag = 1;
        //         // longestCommonPrefix(strs)
        //     } else {
        //         // flag = 0;
        //         break;
        //     }
        // }
        // // if (flag == 1) {
            
        // // }
        // System.out.println(flag + " " + index);
        // return null;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}
