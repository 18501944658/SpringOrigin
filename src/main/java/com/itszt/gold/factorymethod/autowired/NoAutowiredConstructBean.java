package com.itszt.gold.factorymethod.autowired;


import com.itszt.gold.CQ;
import com.itszt.gold.HB;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 *  实例化没有@AutoWired有参构造
 *  多个不同参数的构造函数,需指定默认构造函数(即无参构造函数)
 */
@Data
@Component
public class NoAutowiredConstructBean {
    /**
     * 实例化没有@AutoWired多个有参构造,
     * 默认指定无参构造函数
     */
    public NoAutowiredConstructBean() {
    }

    /***
     * @AutoWired注解的方法或者属性都会触发getBean操作
     *
     * @param cq
     * @param hb
     */
    public NoAutowiredConstructBean(CQ cq, HB hb) {
        System.out.println("cq = " + cq);
        System.out.println("hb = " + hb);
    }


    public NoAutowiredConstructBean(CQ cq) {
        System.out.println("cq = " + cq);
    }
}
