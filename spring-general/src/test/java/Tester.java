import org.springframework.core.env.Environment;

import java.util.List;

/**
 * @description: TODO
 * @author: H.K
 * @program: think-in-spring
 * @create: 2020-04-03 10:03
 */
public class Tester {
    private static Environment environment;
    public static void main(String[] args) {
        List list =null;
        if(null!=list && list.size()>0){
            System.out.println("d");
        }
        System.out.println(getProperty("ddd"));
//        try{
//        if(RuntimeE()!=1){
//            System.out.println("dd");
//        };
//        }catch (RuntimeException e){
//            System.out.println(e);
//        }

    }

    public static int RuntimeE(){
        int i = 1;
        if(i==1) {
//            throw new RuntimeException("0001",new Throwable("异常了"));
            throw new RuntimeException("0001");
        }
        return i;

    }
    public static String getProperty(String prop){
        return environment.getProperty(prop);
    }
}
