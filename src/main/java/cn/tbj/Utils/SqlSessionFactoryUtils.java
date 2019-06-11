/**
 * FileName: SqlSessionFactoryUtils
 * Author:   tbj12
 * Date:     2019/5/26 0026 16:25
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/26 0026
 * @since 1.0.0
 */
public class SqlSessionFactoryUtils {

    private static SqlSessionFactory sqlSessionFactory;

    //使用java.util里面自带的日志
    private static final Logger LOG = Logger.getLogger("SqlSessionFactoryUtils");

    public static SqlSessionFactory getSqlSessionFactory(String configName) {
        LOG.info("开始读取"+configName+"配置信息");
        synchronized (SqlSessionFactoryUtils.class) {
            if (sqlSessionFactory == null) {
                synchronized (SqlSessionFactoryUtils.class) {
                    try {
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(configName));
                    } catch (IOException e) {
                        LOG.severe("获取"+configName+"配置文件失败");
                    }
                }
            }
        }
        LOG.info("读取"+configName+"配置信息动作结束");
        return sqlSessionFactory;
    }

}