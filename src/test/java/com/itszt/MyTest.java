package com.itszt;


import com.itszt.gold.Man;
import com.itszt.gold.Student;
import com.itszt.gold.Teacher;
import com.itszt.gold.even.EnjoyApplicationListener;
import com.itszt.gold.even.EnjoyEvent;
import com.itszt.gold.factorymethod.autowired.AutowiredConstructBean;
import com.itszt.gold.factorymethod.autowired.AutowiredConstructBeanMulti;
import com.itszt.gold.invokebeanfactorypostprocessors.BeanDefinitionNewBean;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShowSexClass people = (ShowSexClass) context.getBean("people");
        people.showSex();
    }

    @Test
    public void testFact2() {
        DefaultNamespaceHandlerResolver defaultNamespaceHandlerResolver = new DefaultNamespaceHandlerResolver();
        System.out.println("defaultNamespaceHandlerResolver = " + defaultNamespaceHandlerResolver);
    }

    @Test
    public void testFact3() {
        /***测试BeanDefinitionRigstryPostProcessor**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Man bean = context.getBean(Man.class);
        System.out.println("bean = " + bean.getName());

    }


    @Test
    public void testFact4() {
        /**扫描器,添加过滤自定义注解,扫描创建和注册BeanDefinition**/
        /***测试BeanDefinitionRigstryPostProcessor**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BeanDefinitionNewBean bean = context.getBean(BeanDefinitionNewBean.class);
        System.out.println("bean = " + bean.getName());
    }


    @Test
    public void testFact5() {
        /**事件监听**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /**有时候我们需要在容器初始化后在添加监听事件**/
        context.addApplicationListener(new EnjoyApplicationListener());
        context.publishEvent(new EnjoyEvent("lijinjian", "enjoyEvent"));
//        context.start();
//        context.stop();
    }

    @Test
    public void testFact6() {
        /**factroy-method**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Man jinjian = (Man) context.getBean("xianghaha");
//        Man jinjian = (Man) context.getBean("jinjian");
        System.out.println("jinjian = " + jinjian);
        System.out.println("jinjian = " + jinjian.getName());
        System.out.println("jinjian = " + jinjian.getSex());
    }
    @Test
    public void testFact7() {
        /**factroy-method=@Bean**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Man damen = (Man) context.getBean("damen");
        System.out.println("damen = " + damen);
        System.out.println("damen = " + damen.getName());
        System.out.println("damen = " + damen.getSex());
    }

    @Test
    public void testFact8() {
        /**@AutoWired单个有参构造函数**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AutowiredConstructBean obj= (AutowiredConstructBean) context.getBean("autowiredConstructBean");
        System.out.println("obj = " + obj);
    }
    @Test
    public void testFact9() {
        /**@AutoWired多个有参构造函数**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AutowiredConstructBeanMulti obj= (AutowiredConstructBeanMulti) context.getBean("autowiredConstructBeanMulti");
        System.out.println("obj = " + obj);
    }
}
