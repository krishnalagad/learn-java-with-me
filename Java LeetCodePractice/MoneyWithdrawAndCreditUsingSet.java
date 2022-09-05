import java.util.*;

public class MoneyWithdrawAndCreditUsingSet {
    static Set<Acc> set = new HashSet<Acc>();

    class Acc {
        int no;
        int bal;

        public Acc() {
        }

        public Acc(int no, int bal) {
            this.no = no;
            this.bal = bal;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getBal() {
            return bal;
        }

        public void setBal(int bal) {
            this.bal = bal;
        }

        @Override
        public String toString() {
            return "Acc [bal=" + bal + ", no=" + no + "]";
        }

    }

    public Set<Acc> doTransaction(String inp) {
        inp = inp.trim();
        String str[] = inp.split(" ");
        int no = Integer.parseInt(str[0]);
        int amount = Integer.parseInt(str[str.length - 1]);

        Acc acc = new Acc(no, amount);

        for (Acc a : set) {
            if (a.no == no) {
                a.bal = a.bal + amount;
                return set;
            }
        }
        set.add(acc);
        return set;
    }

    public static void main(String[] args) {
        MoneyWithdrawAndCreditUsingSet c = new MoneyWithdrawAndCreditUsingSet();
        c.doTransaction("234 has a amount of 2000");
        c.doTransaction("123 has a amount of 2000");
        c.doTransaction("456 has a amount of 5600");
        c.doTransaction("456 has a amount of 400");
        c.doTransaction("234 has a amount of 2000");
        c.doTransaction("456 has a amount of -2000");
        c.doTransaction("567 has a amount of -2000");
        c.doTransaction("123 has amount of -1000");

        System.out.println();

        for (Acc a : set) {
            System.out.println(a.no + " has amount of " + a.bal);
        }

    }
}
