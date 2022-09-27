import java.util.*;

public class ValidPallindromeII {
    public static boolean isValid(String str) {
        StringBuffer buffer = new StringBuffer(str.trim());
        if (str.trim().equals(String.valueOf(buffer.reverse())))
            return true;
        return false;
    }

    public static boolean validPalindrome(String s) {
        String[] strArr = s.split("");
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < s.length(); i++) {
            strArr[i] = "";
            result.add(isValid(String.join("", strArr)));
            strArr = s.split("");
        }
        if (result.contains(true))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome(
                "tkhyzcuolcevmcxqngiemrezsmlrqrwutwbecinfrolmqmnlzglihredxpgidwipbrkqygkcaiuwnshgqetrvgdqhkxgzugjmjlqxdaonegeugqrvowldihcvjtalbmrnypgwimkcmnwmtkuolpcgeievxewnpgwnuppfzzildfazkjebowdjjtxuqcndzrwbwymnveyedftuibheazgbqdfwtozfjwvnhblrlclfqndaiebuymyezahxsdmrxifkwtcxgqmdxfcfuojobekknkoambznbghijslaeyqpbkhdoovgxwihlojkebimntvjpnluacxlnzwhfcqtnuvzvjpkazwotvbvbtwnzrssnqtyniaokpkqqpwpzfnojayozjoomwnknhkphnyvkadsdrkngxjwietzmuvkoozzyoydbiwyqgxlutfugsaxikufubkyucnbkpbjffzivqpuzfwilhmncpcrytunpryzxohfnccbllyhskpszygjgfrfczhjgszasewngubrsxojiqphbqciaooenbstkdblffishfpyxwwluihkxoilmfkrpgpybtyhkvyyjtonakvmvwveectvkrljklvkqthmevkkdjtzfryqghkpjsuzlobdscrormuclxpqgdcrzkjihyroatfmqzqtqebzulhrdiibjuxzbkjkkgfymqqyxpcoezucdbrfkadkyxovjzhqbfcnmhcmgjokigpsgzwrosrfbztxznqdgreldcrmciipvnafnkrpxzdjolkmuynskmemdhlsliklffrifxrsvchuozttsuantjixiilvzsgzqtegpwriqybvmmlktgkdriwpyjdxjngvejfrnmhhglcltdlorbuaaqhilylywjujgwwlagfxmboixetgsgtwdtxcehcpywjmzqfsnqhpbgclossccnnrkdetpjovkpkwjuwxknouyytdliosfyjqhmyndloscdsydhvddfoofddvhdysdcsoldnymhqjyfsoildtyyuonkxwujwkpkvojptedkrnnccssolcgbphqnsfqzmjwypchecxtdwtgsgtexiobmxfgalwwgjujwylylihqaaubroldtlclghhmnrfjevgnjxdjypwirdkgtklmmvbyqirwpgetqzgszvliixijtnausttzouhcvsrxfirfflkilslhdmemksnyumklojdzxprknfanvpiicmrcdlergdqnzxtzbfrsorwzgspgikojgmchmncfbqhzjvoxykdakfrbdcuzeocpxyqqmyfgkkjkbzxujbiidrhluzbeqtqzqmftaoryhijkzrcdgqpxlcumrorcsdbolzusjpkhgqyrfztjdkkvemhtqkvlkjlrkvtceevwvmvkanotjyyvkhytbypgprkfmlioxkhiulwwxypfhsifflbdktsbneooaicqbhpqijoxsrbugnwesazsgjhzcfrfgjgyzspkshyllbccnfhoxzyrpnutyrcpcnmhliwfzupqvizffjbpkbncuykbufukixasguftulxgqywibdyoyzzookvumzteiwjxgnkrdsdakvynhpkhnknwmoojzoyajonfzpwpqqkpkoainytqnssrznwtbvbvtowzakpjvzvuntqcfhwznlxcaulnpjvtnmibekjolhiwxgvoodhkbpqyealsjihgbnzbmaoknkkebojoufcfxdmqgxctwkfixrmdsxhazeymyubeiadnqflclrlbhnvwjfzotwfdqbgzaehbiutfdeyevnmywbwrzdncquxtjjdwobejkzafdlizzfppunwgpnwexveiegcplouktmwnmckmiwgpynrmblatjvchidlwovrqguegenoadxqljmjguzgxkhqdgvrteqghsnwuiackgyqkrbpiwdigpxderhilgzlnmqmlorfnicebwtuwrqrlmszermeignqxcmveclouczyhkt"));
    }
}

/*
 * public boolean validPalindrome(String s) {
 * int left = 0, right = s.length() - 1;
 * 
 * while (left < right) {
 * if (s.charAt(left) != s.charAt(right))
 * return subPalindrome(s, left + 1, right) || subPalindrome(s, left, right -
 * 1);
 * 
 * left++;
 * right--;
 * }
 * 
 * return true;
 * }
 * 
 * public boolean subPalindrome(String s, int left, int right) {
 * while (left < right) {
 * if (s.charAt(left) != s.charAt(right))
 * return false;
 * 
 * left++;
 * right--;
 * }
 * 
 * return true;
 * }
 */