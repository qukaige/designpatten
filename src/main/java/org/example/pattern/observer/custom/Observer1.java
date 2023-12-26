package org.example.pattern.observer.custom;

/**
 * Copyright(C),2018-2025,北京数慧时空信息技术有限公司
 * <p>
 * 设计人员：kaige
 * 开发人员: kaige
 * date 2023/12/26 17:23
 * 描述:
 */
public class Observer1 implements Observer
{

    private Subject subject;

    public Observer1(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg)
    {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }

}