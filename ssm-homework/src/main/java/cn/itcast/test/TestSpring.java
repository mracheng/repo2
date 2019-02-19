package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountServiceImpl");
        accountService.findAll();


    }

}
