public class VariableArgument {
    public static void main(String[] args) {
        varArgsFun(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
    
    public static void varArgsFun(int ...a){
        System.out.println("Length of variable arguments : " + a.length);

        for(int i: a){
            System.out.println(i);
        }
    }
    
}
