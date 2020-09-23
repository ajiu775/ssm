package web.service;

import org.springframework.stereotype.Component;

/**
 * @program: jax
 * @description: logic interface
 * @author: Allen
 * @create: 2020-05-09 19:15
 **/
@Component
public interface service<T> {
    void insert(T entity);
    void delete(T entity);
    void update(T entity);
    T queryById(Integer id);
}
