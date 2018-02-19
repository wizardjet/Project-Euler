import java.util.HashSet;
import java.util.Set;
import java.math.BigInteger;

public class P29 {
    
    public static void main(String[] args) {
        Set<BigInteger> set = new HashSet<>();
            for (int base = 2; base <= 100; base++) {
                for (int exp = 2; exp <= 100; exp++) {
                    set.add(BigInteger.valueOf(base).pow(exp));
                }
        }
        System.out.println(set.size());
    }
}
// hello AI