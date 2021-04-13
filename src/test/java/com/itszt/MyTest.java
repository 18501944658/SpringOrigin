package com.itszt;


import com.itszt.gold.CQ;
import com.itszt.gold.Man;
import com.itszt.gold.Student;
import com.itszt.gold.Teacher;
import com.itszt.gold.aware.AwareBean1;
import com.itszt.gold.cycle.CycleBeanAAA;
import com.itszt.gold.cycle.CycleBeanBBB;
import com.itszt.gold.even.EnjoyApplicationListener;
import com.itszt.gold.even.EnjoyEvent;
import com.itszt.gold.factorymethod.ApplicationContextAccessor;
import com.itszt.gold.factorymethod.autowired.*;
import com.itszt.gold.instantiationAwareBeanPostProcessor.Demo;
import com.itszt.gold.invokebeanfactorypostprocessors.BeanDefinitionNewBean;
import com.itszt.gold.lookup.ShowSexClass;
import com.itszt.gold.propertValue.PropertyKeyValue;
import com.itszt.gold.scope.CustomScope;
import com.itszt.gold.scope.CustomScopeBean;
import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.DefaultNamespaceHandlerResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

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

    /**
     * ========================================事件监听==================================================================
     */
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
    /**========================================事件监听==================================================================*/

    /**
     * ========================================factory-method==================================================================
     */

    @Test
    public void testFact6() {
        /**factroy-method**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Man jinjian = (Man) context.getBean("xianghaha");
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
        AutowiredConstructBean obj = (AutowiredConstructBean) context.getBean("autowiredConstructBean");
        System.out.println("obj = " + obj);
    }

    @Test
    public void testFact9() {
        /**@AutoWired多个有参构造函数**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AutowiredConstructBeanMulti obj = (AutowiredConstructBeanMulti) context.getBean("autowiredConstructBeanMulti");
        System.out.println("obj = " + obj);
    }

    @Test
    public void testFact10() {
        /**实例化没有@AutoWired有参构造**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        NoAutowiredConstructBean obj = (NoAutowiredConstructBean) context.getBean("noAutowiredConstructBean");
        System.out.println("obj = " + obj);
    }

    @Test
    public void testFact11() {
        /**实例化无参构造**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        NoConstructBean obj = (NoConstructBean) context.getBean("noConstructBean");
        System.out.println("obj = " + obj);
    }

    /**
     * ========================================factory-method==================================================================
     */


    @Test
    public void testFact12() {
        /**实例化无参构造**/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AutowiredBean obj = (AutowiredBean) context.getBean("autowiredBean");
        System.out.println("obj = " + obj);
    }

    /***
     * 测试实现AwareBean接口
     */
    @Test
    public void testFact13() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AwareBean1 obj = (AwareBean1) context.getBean("awareBean1");
        System.out.println("测试实现AwareBean接口 = " + obj);
    }

    /***
     * 测试实现InstantiationAwareBeanPostProcessor接口
     * 实现该接口,覆写postProcessAfterInstantiation方法并返回fasle,可以阻止bean的依赖注入
     */
    @Test
    public void testFact14() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Demo demo = (Demo) context.getBean("demo");
        CQ cq = demo.getCq();
        System.out.println("InstantiationAwareBeanPostProcessor---cQ = " + cq);
    }


    /***
     * 测试实现依赖注入
     *
     */
    @Test
    public void testFact15() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Demo demo = (Demo) context.getBean("demo");
        CQ cq = demo.getCq();
        System.out.println("IOC---cQ = " + cq);
    }


    /***
     * 测试循环依赖
     *
     */
    @Test
    public void testFact16() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CycleBeanAAA cycleBeanAAA = context.getBean(CycleBeanAAA.class);
        CycleBeanBBB cycleBeanBBB = context.getBean(CycleBeanBBB.class);
    }

    /***
     * 模拟@Bean传参的注解模式
     *
     */
    @Test
    public void testFact17() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContextAccessor bean = context.getBean(ApplicationContextAccessor.class);
        System.out.println("bean = " + bean);
    }

    /***
     * 销毁bean
     *
     */
    @Test
    public void testFact18() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.getBeanFactory().destroyBean(ApplicationContextAccessor.class);
        context.getBeanFactory().destroySingletons();
    } 
    
    /***
     *  bean初始化属性值测试
     *
     */
    @Test
    public void testFact19() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PropertyKeyValue bean = context.getBean(PropertyKeyValue.class);
        System.out.println("bean.getName() = " + bean.getName());
    }


    /***
     *  Environment对象和读取本地配置文件对象的解析测试
     *
     *  Environment对象中最主要的属性就是propertySources属性,而propertySources属性本质就是MutableProperySources
     *
     */
    @Test
    public void testFact20() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Environment bean = context.getBean(Environment.class);
        System.out.println("bean= " + bean);
    }

    /***
     * 实现FactoryBean接口,并覆写方法
     *
     */
    @Test
    public void testFact21() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /**拿到实现FactoryBean接口的类实际获取的Bean方法**/
        Student student = (Student) context.getBean("factoryBeanDemo");
        System.out.println("student = " + student);
        /**拿到实现FactoryBean接口的类实例本身则需要再BeanName前加&符号**/
        FactoryBean factoryBean = (FactoryBean) context.getBean("&factoryBeanDemo");
        System.out.println("factoryBean = " + factoryBean);
    }

    /***
     * 自定义scope
     *
     */
    @Test
    public void testFact22() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        CustomScopeBean bean = context.getBean(CustomScopeBean.class);
        System.out.println("CustomScopeBean = " + bean);

    }
}
