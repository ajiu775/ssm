package web.dao;

import org.springframework.stereotype.Component;
import web.entity.Student;

/**
 * @program: jax
 * @description: Operation dataBase of the system to change data about student
 * @author: Allen
 * @create: 2020-05-11 16:57
 **/
@Component
public interface StudentDao extends BaseDao<Student> {

}
