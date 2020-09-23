package web.dao;

import org.springframework.stereotype.Component;

/**
 * @program: jax
 * @description: This BaseDao is father of subDao
 * @author: Allen
 * @create: 2020-05-11 16:17
 **/
@Component
public interface BaseDao<T> {
    /**
     * @param entity :  object <=> database object
     * @description: insert data
     * @return: void
     * @author: Allen
     * @date: 2020-05-12
     * @time: 20:19
     */
    void insert(T entity);

    /**
     * @param id :   Integer
     * @description: delete data according to id (primary key)
     * @return: void
     * @author: Allen
     * @date: 2020-05-12
     * @time: 20:21
     */
    void delete(Integer id);

    /**
     * @param entity :
     * @description: update data according to id (primary id)
     * @return: void
     * @author: Allen
     * @date: 2020-05-12
     * @time: 20:23
     */
    void update(T entity);

    /**
     * @param id :
     * @description: search data through id (primary key)
     * @return: T
     * @author: Allen
     * @date: 2020-05-12
     * @time: 20:31
     */
    T findById(Integer id);
}
