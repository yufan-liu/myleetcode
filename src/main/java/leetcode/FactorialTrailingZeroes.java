package leetcode;

/**
 * Created by Patrick on 15/4/11.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int num = 0;
        while (n != 0) {
            num += n / 5;
            n = n / 5;
        }
        return num;
    }
}
