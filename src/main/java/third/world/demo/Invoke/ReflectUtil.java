package third.world.demo.Invoke;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-01-07 23:46
 **/
public class ReflectUtil {

    public static void methodReflect(Class obj){
//        Field field = obj.getDeclaredField();
        Method[] methods = obj.getMethods();
        Method[] method = obj.getDeclaredMethods();
        for(int i=0;i<method.length;i++){
            System.out.println(method[i].getReturnType()+" "+method[i].getName());
        }
    }

    public static void fieldReflect(Class obj){
        Field[] fields = obj.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            System.out.println(fields[i].getType().getSimpleName()+" "+fields[i].getName());
        }
    }

    public static void main(String[] args){
        methodReflect(Person.class);
        fieldReflect(Person.class);
    }
}
