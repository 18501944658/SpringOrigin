package com.itszt;


import com.itszt.gold.Student;
import com.itszt.gold.Teacher;
import com.itszt.gold.lookup.ShowSexClass;
import org.junit.Test;
import org.springframework.beans.factory.xml.DefaultNamespaceHandlerResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /***
     * 读取配置文件获取bean对象
     */
    @Test
    public void testFact() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Teacher teacher = context.getBean(Teacher.class);
        Student student = context.getBean(Student.class);
        System.out.println("teacher = " + teacher);
        System.out.println("student = " + student);
    }


    @Test
    public void testFact1() {
        /**look-up**/
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ShowSexClass people = (ShowSexClass) context.getBean("people");
        people.showSex();
    }

    @Test
    public void testFact2() {
        DefaultNamespaceHandlerResolver  defaultNamespaceHandlerResolver= new DefaultNamespaceHandlerResolver();
        System.out.println("defaultNamespaceHandlerResolver = " + defaultNamespaceHandlerResolver);
    }
}
