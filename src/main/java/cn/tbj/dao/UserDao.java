/**
 * FileName: UserDao
 * Author:   tbj12
 * Date:     2019/5/26 0026 18:54
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.dao;

import cn.tbj.bean.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/26 0026
 * @since 1.0.0
 */
public interface UserDao {

    int addUser(User user);

    List<User> getAllUsers();

}