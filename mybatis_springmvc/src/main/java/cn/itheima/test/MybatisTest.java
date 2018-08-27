package cn.itheima.test;

import cn.itheima.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {
    /**
     * 测试根据用户id查询用户
     */
    @Test
    public void queryUserByIdTest() throws  Exception{

        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //读取配置文件内容
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行数据库操作

        User user = sqlSession.selectOne("test.queryUserById", 10);
        System.out.println(user);
        //释放资源
        sqlSession.close();

    }
    /**
     * 新增用户
     */
    @Test
    public void insertUserTest(){
        //创建sqlSe
        SqlSessionFactory

    }

}
