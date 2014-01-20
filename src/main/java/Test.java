import com.muzy.test.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiaoxue on 14-1-15.
 */
public class Test {

    private static final String[] FRONT_PATH = {"client.xml"};
    private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(FRONT_PATH);
    public static void main(String[] args) throws InterruptedException {

        context.start();

        User u = (User)context.getBean("userReq");
        u.test("test");

        Thread.sleep(10000000);
    }
}
