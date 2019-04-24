package org.bdqn.logistics;

import org.bdqn.logistics.service.RonglianSmsCodeService;
import org.bdqn.logistics.service.RonglianSmsCodeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogisticsApplicationTests {

    @Autowired
    RonglianSmsCodeService smsCodeService;
    @Test
    public void contextLoads() {
        String a = "123"; String b = "123";
        System.out.println(a==b);
    }

}
