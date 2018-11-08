package third.world.demo.dto;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
public class ResultTO<T> {
    private int code = 200;
    private boolean success = true;
    private String msg;
    private T result;
    private PageTO page;

    public ResultTO() {
    }

    public ResultTO(T result) {
        this.result = result;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public PageTO getPage() {
        return this.page;
    }

    public void setPage(PageTO page) {
        this.page = page;
    }

    public void authException(String msg) {
        this.code = 403;
        this.msg = msg;
        this.success = false;
    }

    public void commonException(String msg) {
        this.code = 400;
        this.msg = msg;
        this.success = false;
    }

    public void serverException(String msg) {
        this.code = 500;
        this.msg = msg;
        this.success = false;
    }
}
