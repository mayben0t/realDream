package third.world.demo.algorithm;

/**
 * @program: demo
 * @description:
 * @author: WangX
 * @create: 2019-03-18 11:32
 **/
public class Test {

    public static void main(String[] args) {
        char c = 49;
        System.out.println(c);
    }

    public String get(String n) throws Exception{
        char[] arr = n.toCharArray();
        for(char x:arr){
            if(x>48&&x<57){

            }else {
                throw  new Exception();
            }
        }
        return n;
    }


}
