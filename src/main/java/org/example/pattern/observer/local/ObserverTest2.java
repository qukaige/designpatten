package org.example.pattern.observer.local;

public class ObserverTest2 {
    public static void main(String[] args)
    {
        //模拟一个3D的服务号
        SubjectFor3d subjectFor3d = new SubjectFor3d() ;
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ() ;

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d); // observer1 注册到 SubjectFor3d
        Observer1 observer2 = new Observer1();
        observer2.registerSubject(subjectFor3d); // observer2 注册到 SubjectFor3d
        observer1.registerSubject(subjectForSSQ);
        subjectFor3d.setMsg("hello 3d'nums : 110 ");
//        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }
}
