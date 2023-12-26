package org.example.pattern.observer.custom;

/**
 * Copyright(C),2018-2025,北京数慧时空信息技术有限公司
 * <p>
 * 设计人员：kaige
 * 开发人员: kaige
 * date 2023/12/26 17:51
 * 描述:
 */
public class ObserverTest {
    public static void main(String[] args)
    {
        //模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户1
        Observer observer1 = new Observer1(subjectFor3d);
        Observer observer2 = new Observer2(subjectFor3d);
        subjectFor3d.removeObserver(observer2);
        subjectFor3d.setMsg("20140420的3D号码是：127" );
        subjectFor3d.setMsg("20140421的3D号码是：333" );

    }
}
