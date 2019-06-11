/**
 * FileName: User
 * Author:   tbj12
 * Date:     2019/5/26 0026 18:52
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.bean;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/26 0026
 * @since 1.0.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Map favority;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", favority=" + favority +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map getFavority() {
        return favority;
    }

    public void setFavority(Map favority) {
        this.favority = favority;
    }
}