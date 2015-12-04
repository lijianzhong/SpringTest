package com.lijz.spring.aop;

/**
 * Created by jianzhongli on 15/12/4.
 */
public class TestBean {

    private String testSomething;

    public String getTestSomething() {
        return testSomething;
    }

    public void setTestSomething(String testSomething) {
        this.testSomething = testSomething;
    }

    public void test(){
        System.out.println("test");
    }
}
