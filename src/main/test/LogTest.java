import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @program: jax
 * @description: Test log
 * @author: Allen
 * @create: 2020-05-11 10:09
 **/
@Slf4j
public class LogTest {
    @Test
    public void logTest(){
        log.debug("测试日志:{}","开始测试");
    }
}
