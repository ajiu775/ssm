import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import web.dao.StudentDao;
import web.entity.Student;

/**
 * @program: jax
 * @description: Test Mybatis
 * @author: Allen
 * @create: 2020-05-11 17:25
 **/
public class MybatisTest extends BaseTest {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void insert() {
        Student student = new Student();
        student.setName("阿旧");
        student.setSno(3);
        student.setPassword("123456");
        student.setTelephone(133898989);
        studentDao.insert(student);
    }

    @Test
    public void delete() {
        Integer id = 7;
        studentDao.delete(id);
    }

    @Test
    public void update() {
        Student student = new Student();
        student.setId(1);
        student.setName("阿旧");
        student.setSno(9);
        student.setPassword("654321");
        student.setTelephone(19999);
        studentDao.update(student);
    }

    @Test
    public void findById() {
        Integer id = 1;
        Student studentResult = studentDao.findById(id);
        System.out.println(studentResult.toString());
    }
}
