class CompareNumbers{
    public static int compareNumber(Integer no1, Integer no2) {

        return no1.compareTo(no2);
    }
    
    public static void main(String[] args) {
        String str = (compareNumber(12, 12) == 0) ? "Equal" : "Not Equal"; 
        System.out.println(str);
    }
}