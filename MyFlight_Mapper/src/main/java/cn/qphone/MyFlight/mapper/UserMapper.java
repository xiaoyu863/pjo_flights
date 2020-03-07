package cn.qphone.MyFlight.mapper;

import cn.qphone.MyFlight.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * 用户底层接口函数
 * 配置mybatis调用数据库
 * 三个参数为传入mybatis的字段
 */
public interface UserMapper {

    public List<User> findList(@Param("take_time") String take_time,@Param("take") String param2,@Param("landing") String param3);
    public User get(int uid);
    public void update(User user);
    public User findByUname(String uname);

}
