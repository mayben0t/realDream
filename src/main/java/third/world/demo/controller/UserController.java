package third.world.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import third.world.demo.dto.ResultTO;
import third.world.demo.model.User;
import third.world.demo.service.UserService;

import java.util.List;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
@RequestMapping("/user")
@RestController
@Api("用户信息")
public class UserController {
    @Autowired
   private  UserService userService;


    @PostMapping
    public ResultTO insert(User user){
        ResultTO result = new ResultTO();
        try {
//            userService.insert(user);
        }catch (Exception e){

        }
        return result;
    }

    @ApiOperation(value="获取用户列表", notes="获取所有用户列表",produces = "application/json")
    @GetMapping
    public ResultTO select(@ApiParam @RequestParam int userId){
        ResultTO<List<User>> result = new ResultTO();
        result.setResult(userService.query());
        return result;
    }

}
