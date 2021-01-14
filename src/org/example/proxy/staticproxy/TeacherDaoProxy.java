package org.example.proxy.staticproxy;

//代理对象，静态代理

public class TeacherDaoProxy implements ITeacherDao {

    //目标对象，通过接口聚合

    private ITeacherDao taget;

    public TeacherDaoProxy(ITeacherDao taget) {
        this.taget = taget;
    }

    @Override
    public void teach() {
        System.out.println("代理开始，完成某些操作 .....");
        taget.teach();
        System.out.println("代理提交 .....");
    }
}
