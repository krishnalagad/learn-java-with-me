package DSA;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Cryptography {
    private Long id;
    private String algo;
    private Long hsm;

    public Cryptography(Long id, String algo, Long hsm) {
        this.id = id;
        this.algo = algo;
        this.hsm = hsm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlgo() {
        return algo;
    }

    public void setAlgo(String algo) {
        this.algo = algo;
    }

    public Long getHsm() {
        return hsm;
    }

    public void setHsm(Long hsm) {
        this.hsm = hsm;
    }
}


public class SummerizingInt {
    public static void summery(List<Cryptography> list) {
        if (list.isEmpty()) return;
        long start = System.currentTimeMillis();
        LongSummaryStatistics statistics = list.stream().collect(Collectors.summarizingLong(Cryptography::getHsm));
        System.out.println("Max HSM: " + statistics.getMax());
        System.out.println("Min HSM: " + statistics.getMin());
        System.out.println("Average HSM: " + statistics.getAverage());
        System.out.println("Count of HSM: " + statistics.getCount());
        System.out.println("Sum of all HSM: " + statistics.getSum());
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start) + "ms");

    }
    public static void main(String[] args) {
        List<Cryptography> cryptographyList = IntStream.range(1, 10000001)
                        .mapToObj(i -> new Cryptography((long) i, "Algo"+i, (long) 1100+i)).toList();
        summery(cryptographyList);
    }
}
