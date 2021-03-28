package com.itszt.gold.factorymethod.autowired;


import com.itszt.gold.CQ;
import com.itszt.gold.HB;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * 多个构造函数
 */
@Data
@Component
public class AutowiredConstructBeanMulti {

    /***
     * @AutoWired注解的方法或者属性都会触发getBean操作
     *
     * 多个构造函数则会排序只实例化一个,会根据默认参数个数进行排序
     *
     * 一个类中定义多个构造函数,不报错这在构造方法上加@Autowired(required = false)
     * @param cq
     * @param hb
     */
    @Autowired(required = false)
    public AutowiredConstructBeanMulti(CQ cq, HB hb) {
        System.out.println("cq = " + cq);
        System.out.println("hb = " + hb);
    }

    @Autowired(required = false)
    public AutowiredConstructBeanMulti(CQ cq) {
        System.out.println("cq = " + cq);
    }
}
