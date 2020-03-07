package cn.qphone.MyFlight.service;



import cn.qphone.MyFlight.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findList(String take_time,String airport_name_take,String airport_name_landing);
    public void updateTransfer(int from_uid, int to_uid, double money);
    public User login(User user);
}
