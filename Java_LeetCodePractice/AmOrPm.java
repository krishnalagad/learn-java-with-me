public class AmOrPm {
    public static String solve(String time){
        String[] strArr = time.split(":");
        int hours = Integer.valueOf(strArr[0]);
        if(hours > 12){
            return "PM";
        }
        return "AM";
    }
    public static void main(String[] args) {
        System.out.println(solve("11:45"));
        System.out.println(solve("00:45"));
        System.out.println(solve("02:45"));
        System.out.println(solve("15:45"));
    }
}
