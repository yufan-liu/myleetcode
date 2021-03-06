import leetcode.RepeatedDNASequences;
import org.junit.Test;

import java.util.List;

/**
 * Created by Patrick on 15/4/21.
 * User: yf_liu
 * Date: 2015/4/21
 * Time: 19:22
 */
public class TestRepeatedDNASequences {
    @Test
    public void testSample() throws Exception {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        RepeatedDNASequences rds = new RepeatedDNASequences();
        List<String> strs = rds.findRepeatedDnaSequences(str);
        assert strs.size() == 2;
        assert strs.get(0).equals("AAAAACCCCC");
        assert strs.get(1).equals("CCCCCAAAAA");
//        assert rds.findRepeatedDnaSequences("abcde") == null;
//        assert rds.findRepeatedDnaSequences(null) == null;
//        assert rds.findRepeatedDnaSequences("abcdeabcde") == null;
//        assert rds.findRepeatedDnaSequences("abcdeabcdea").size() == 0;
//        assert rds.findRepeatedDnaSequences("aaaaaaaaaa") == null;
        assert rds.findRepeatedDnaSequences("aaaaaaaaaaa").size() == 1;
//        assert rds.findRepeatedDnaSequences("aaaaaaaaaaaa").size() == 1;
//        assert rds.findRepeatedDnaSequences("123456789123456789").size() == 0;
//        assert rds.findRepeatedDnaSequences("1234567891234567891").size() == 1;
    }

    @Test
    public void testSampleOffical() throws Exception {
        RepeatedDNASequences rds = new RepeatedDNASequences();
        List<String> list = rds.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        assert list.size() == 2;
        assert list.get(0).equals("AAAAACCCCC");
        assert list.get(1).equals("CCCCCAAAAA");
    }
}
