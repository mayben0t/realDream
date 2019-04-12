package third.world.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import third.world.demo.dto.ResultTO;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-02-01 00:12
 **/
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public ResultTO res(CommonException exception){
        ResultTO resultTO = new ResultTO();
        resultTO.setCode(500);
        resultTO.setSuccess(false);
        resultTO.setResult(exception.getMsg());
        return resultTO;
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Throwable.class)
    @ResponseBody
    public ResultTO res(Throwable exception){
        ResultTO resultTO = new ResultTO();
        resultTO.setCode(500);
        resultTO.setSuccess(false);
        resultTO.setResult(exception.getMessage());
        return resultTO;
    }

}
