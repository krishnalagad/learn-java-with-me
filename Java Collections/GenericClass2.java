public class GenericClass2 {
    static class Type2<T> {
        private T var1;

        public Type2() {

        }

        public Type2(T var1) {
            this.var1 = var1;
        }

        public void setVar(T var1) {
            this.var1 = var1;
        }

        public T getVar() {
            return this.var1;
        }
    }

    public static void main(String[] args) {
        Type2<Float> type2 = new Type2<>(12.8f);
        System.out.println(type2.getVar());

        
    }
}
