package com.example.springboottest.service;

import com.example.springboottest.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private UserService userService;
    // Logger logger = LoggerFactory.getLogger(UserService.class);

    @Test
    public void test_logging(){
        String str = "sdf";
        // logger.debug("您输入的{}{}{}",str,str,str);
        log.debug("sdfsdf{}",str);
    }

    @Test
    public void test_user(){
        User user = new User("BO","956");
        log.debug(user.getName());
        log.debug(user.toString());
    }

    @Test
    @DisplayName("输入1+2，预期3")
    public void test_add(){
        System.out.println("haha");
        Assertions.assertEquals(3,userService.add(1,2));
    }

    @Test
    public void test_addString(){
        Assertions.assertThrows(Exception.class,() -> {
            userService.addString("BO");
        });
    }

}
