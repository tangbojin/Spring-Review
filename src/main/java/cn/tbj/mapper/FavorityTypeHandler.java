/**
 * FileName: FavorityTypeHandler
 * Author:   tbj12
 * Date:     2019/5/27 0027 22:04
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.mapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/27 0027
 * @since 1.0.0
 */

@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Map.class)
public class FavorityTypeHandler extends BaseTypeHandler<Object> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, JSON.toJSONString(o));
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, String s) throws SQLException {
        Object parse = JSONObject.parse(resultSet.getString(s));
        Map<String, Object> map = (Map<String, Object>) parse;
        return map;
    }

    @Override
    public Object getNullableResult(ResultSet resultSet, int i) throws SQLException {
        Object parse = JSONObject.parse(resultSet.getString(i));
        Map<String, Object> map = (Map<String, Object>) parse;
        return map;
    }

    @Override
    public Object getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        Object parse = JSONObject.parse(callableStatement.getString(i));
        Map<String, Object> map = (Map<String, Object>) parse;
        return map;
    }
}