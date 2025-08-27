public class StudentAttendenceRecordI {
    public static boolean checkRecord(String s) {
        int absent = 0, late = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L')
                late += 1;
            else {
                late = 0;
                if (ch == 'A')
                    absent += 1;
            }
            if (absent >= 2 || late == 3)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkRecord("APPALLP"));
    }
}
