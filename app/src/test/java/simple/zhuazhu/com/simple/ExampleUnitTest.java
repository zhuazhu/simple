package simple.zhuazhu.com.simple;

import com.zhuazhu.util.StringUtils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine
 * (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test() throws Exception{
        String money = StringUtils.money(9684.8);
        boolean flag = StringUtils.validateIdentity("51152119890506529X");
        System.out.println(StringUtils.validateNumber("-1."));
        System.out.print(Double.valueOf("+.1"));
        System.out.println(money);
    }
}