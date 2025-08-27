public class GenericClass1 {
    static class Type1<T> {
        private T var1;

        public Type1() {
        }

        public Type1(T var1) {
            this.var1 = var1;
        }

        public T getVar1() {
            return var1;
        }

        public void setVar1(T var1) {
            this.var1 = var1;
        }

    }

    public static void main(String[] args) {
        Type1<Integer> type1 = new Type1<>(10);
        System.out.println(type1.getVar1());

        Type1<String> type2 = new Type1<>("Krishna");
        System.out.println(type2.getVar1());
    }
}