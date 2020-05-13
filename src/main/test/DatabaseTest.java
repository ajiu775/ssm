import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @program: jax
 * @description:
 * @author: Allen
 * @create: 2020-05-11 22:01
 **/

public class DatabaseTest {

    @Test
    public void test() throws Exception{
            Connection connection = null;
            PreparedStatement prepareStatement = null;
            ResultSet rs = null;

            try {
                // 加载驱动
                Class.forName("com.mysql.cj.jdbc.Driver");
                // 获取连接
                String url = "jdbc:mysql://106.52.235.72:3306/school";
                String user = "root";
                String password = "123456";
                connection = DriverManager.getConnection(url, user, password);
                // 获取statement，preparedStatement
                String sql = "select * from student where id=?";
                String insert="UPDATE student(name,sno,telephone,password) values ('阿旧',3,133898989,'123456')";
                prepareStatement = connection.prepareStatement(insert);
                // 设置参数
                //prepareStatement.setLong(1, 1l);
                // 执行查询
                boolean a= prepareStatement.execute();
                System.out.println(a);
                // 处理结果集

            } finally {
                // 关闭连接，释放资源
                if (rs != null) {
                    rs.close();
                }
                if (prepareStatement != null) {
                    prepareStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }


}
