package third.world.demo.pachong;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2019/2/13
 **/
public class Assert {
    public Assert() {
    }

    public static boolean isNull(String value) {
        return value == null || value.trim().length() == 0 || "null".equalsIgnoreCase(value.trim());
    }

    public static boolean isNotNull(String value) {
        return !isNull(value);
    }
}
