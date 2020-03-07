package cn.qphone.MyFlight.service.impl;


import cn.qphone.MyFlight.mapper.UserMapper;
import cn.qphone.MyFlight.pojo.User;
import cn.qphone.MyFlight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 用户服务层，调用用户底层接口
 *
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList(String take_time,String airport_name_take,String airport_name_landing) {
        return userMapper.findList(take_time,airport_name_take,airport_name_landing);
    }

    @Override
    public void updateTransfer(int from_uid, int to_uid, double money) {

    }

    @Override
    public User login(User user) {
        return null;
    }

//    @Override
//    public void updateTransfer(int from_uid, int to_uid, double money) {
//        User user1 = userMapper.get(from_uid); // 查到用户，包换了余额
//        user1.setMoney(user1.getMoney() - money);
//        User user2 = userMapper.get(to_uid);
//        user2.setMoney(user2.getMoney() + money);
//        userMapper.update(user1);
//        userMapper.update(user2);
//    }

//    @Override
//    public User login(User u) {
//        User user = userMapper.findByUname(u.getUname());
//        if (user != null) {
//            if (u.getUpass().equalsIgnoreCase(user.getUpass())) {
//                return user;
//            }
//        }
//        return null;
//    }

}
