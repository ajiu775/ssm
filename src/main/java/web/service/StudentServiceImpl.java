package web.service;

import org.springframework.stereotype.Component;
import web.dao.StudentDao;
import web.entity.Student;

import javax.annotation.Resource;

/**
 * @Description: implement service
 * @Author: Mr.Allen
 * @Date: 2020/9/23/23:36
 */
@Component
public class StudentServiceImpl implements service<Student> {
    @Resource
    private StudentDao studentDao;

    @Override
    public void insert(Student student) {
        studentDao.insert(student);
    }

    @Override
    public void delete(Student student) {
        studentDao.delete(student.getId());
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public Student queryById(Integer id) {
        return studentDao.findById(id);
    }
}