package third.world.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import third.world.demo.model.User;

import java.util.List;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
@Repository
public interface UserMapper {
    public void insert(@Param("user") User user);

     List<User> select(int userId);
}
