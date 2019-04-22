import com.zzh.user.Application;
import com.zzh.user.po.request.LoginRequest;
import com.zzh.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-18:52
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDB {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        try {
            LoginRequest request = new LoginRequest();
            request.setMobile("15233747453");
            request.setPassword("123456");
            System.out.println(userService.login(request));
        }catch (Exception e){
            e.printStackTrace();

        }

    }

}
