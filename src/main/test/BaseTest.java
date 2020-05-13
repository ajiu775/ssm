import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: jax
 * @description: init spring
 * @author: Allen
 * @create: 2020-05-11 17:20
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/applicationContext.xml")
public class BaseTest {

    @Test
    public void testSpringInit(){
        System.out.println("Initial Spring Success");
    }
}
