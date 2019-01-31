package third.world.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
    private UserMapper userMapper;

    public void insert(User record){
        userMapper.insert(record);
    }

    @CacheEvict(value = "user")
    public void delete(Integer id){
        userMapper.deleteByPrimaryKey(id);
    }

    public void update(User record){
        userMapper.updateByPrimaryKey(record);
    }

    @Cacheable(value = "user",key = "")
    public List<User> query(){
        return userMapper.select();
    }


}
