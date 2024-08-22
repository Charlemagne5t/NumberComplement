import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1 () {
        int num = 8;
        int expected = 7;
        int actual = new Solution().findComplement(num);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2 () {
        int num = 16;
        int expected = 15;
        int actual = new Solution().findComplement(num);

        Assert.assertEquals(actual, expected);
    }
}
