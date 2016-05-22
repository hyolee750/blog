import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/22.
 */
public class IdeaTest {

    @Test
    public void test01(){
        String hello = "hello";
        if (hello == null) {
            System.out.println("hello");
        }
        Date date = new Date();
        date.getTime();
        System.out.println(date.getTime());
        System.out.println();
        date.getTime();

    }
}
