public class HandsOfStraight {
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length == groupSize || hand.length < 2 && groupSize < 2)
            return false;
        return hand.length % groupSize == 0 ? true : false;
    }

    public static void main(String[] args) {
        int[] hand = { 12, 23, 34 };
        System.out.println(isNStraightHand(hand, 1));
    }
}
