package third.world.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import third.world.demo.model.User;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
@Repository
public interface UserMapper {
    public void insert(@Param("user") User user);
}
