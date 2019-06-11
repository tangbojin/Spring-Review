/**
 * FileName: test
 * Author:   tbj12
 * Date:     2019/5/26 0026 15:53
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.service;

import cn.tbj.Utils.SqlSessionFactoryUtils;
import cn.tbj.bean.User;
import cn.tbj.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/26 0026
 * @since 1.0.0
 */
public class test {

    public static void main(String[] args) throws IOException {
        /*InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);*/

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory("mybatis-conf.xml");
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setUsername("佳兆业");
        user.setPassword("2b505");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("爱好一", "唱跳");
        map.put("爱好二", "rap");
        map.put("爱好三", "篮球");
        user.setFavority(map);

        /*userDao.addUser(user);*/

        List<User> allUsers = userDao.getAllUsers();

        for (User u : allUsers) {
            System.out.println(u);
        }



        /*List<Object> list = sqlSession.selectList("cn.tbj.getAllFood");
        for (Object o : list) {
            System.out.println(o.toString());

        }*/
        sqlSession.commit();
        sqlSession.close();

        /*System.out.println(user);*/

    }

}