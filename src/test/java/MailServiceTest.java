import com.example.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: 于军振
 * @Date: 2019/8/22 17:08
 * @Version 1.0
 */

    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class MailServiceTest {


        @Autowired
        private MailService MailService;

        @Test

        public void testSimpleMail() throws Exception {

            MailService.sendSimpleMail("15703758412@163.com","test simple mail"," hello this is simple mail");

        }

    }

