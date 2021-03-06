package com.cyl.demo.aop.service;

import com.cyl.demo.aop.aspectJAopDemo.NeedTest;

/**
 * @Description
 * @Author dianXiao2
 * @Version V1.0.0
 * @Date 2019/7/1
 */
public interface Waiter {
    void greetTo(String name);

    void serveTo(String name);

    String giveTo(String name);

    void hello(String name);
}
