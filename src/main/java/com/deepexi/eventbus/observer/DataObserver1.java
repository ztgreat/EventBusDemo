package com.deepexi.eventbus.observer;

import com.google.common.eventbus.Subscribe;

public class DataObserver1 {

    /**
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数
     *
     * @param msg
     */
    @Subscribe
    public void func(String msg) {
        System.out.println("String msg: " + msg);
    }

    @Subscribe
    public void func2(String msg) {
        System.out.println("String msg2: " + msg);
    }


}
