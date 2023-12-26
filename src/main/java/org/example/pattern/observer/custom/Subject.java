package org.example.pattern.observer.custom;

/**
 * Copyright(C),2018-2025,北京数慧时空信息技术有限公司
 * <p>
 * 设计人员：kaige
 * 开发人员: kaige
 * date 2023/12/26 17:16
 * 描述:
 */
public interface Subject {
    /**
     * 注册一个观察着
     *
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察着
     */
    public void notifyObservers();

}
