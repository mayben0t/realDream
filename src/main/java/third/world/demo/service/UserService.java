package third.world.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import third.world.demo.mapper.UserMapper;
import third.world.demo.model.User;

import java.util.List;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
@Service("userService")
public class UserService {
    @Autowired
    UserMapper userMapper;


    public void insert(User user){
        userMapper.insert(user);
    }

    public List<User> select(int userId){
        return userMapper.select(userId);
    }
}
