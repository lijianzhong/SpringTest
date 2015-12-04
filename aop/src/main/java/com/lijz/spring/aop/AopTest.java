package com.lijz.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianzhongli on 15/12/4.
 */
public class AopTest {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = (TestBean) applicationContext.getBean("test");
        testBean.test();
    }
}