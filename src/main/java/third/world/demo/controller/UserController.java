package third.world.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import third.world.demo.dto.ResultTO;
import third.world.demo.model.User;
import third.world.demo.service.UserService;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping
    public ResultTO insert(User user){
        ResultTO result = new ResultTO();
        try {
            userService.insert(user);
        }catch (Exception e){

        }
        return result;
    }


}
