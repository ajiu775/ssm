package web.entity;

import lombok.Data;

/**
 * @program: jax
 * @description: student
 * @author: Allen
 * @create: 2020-05-10 17:13
 **/
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer sno;
    private Integer telephone;
    private String password;

    @Override
    public String toString() {
        return "Id:" + this.id + "\n" +
                "Name:" + this.name + "\n" +
                "Sno:" + this.sno + "\n" +
                "Telephone:" + this.telephone + "\n" +
                "Password:" + this.password;
    }
}
