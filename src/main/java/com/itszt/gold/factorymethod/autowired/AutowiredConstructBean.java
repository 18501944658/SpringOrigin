package com.itszt.gold.factorymethod.autowired;


import com.itszt.gold.CQ;
import com.itszt.gold.HB;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * 单个构造函数
 */
@Data
//@Component
public class AutowiredConstructBean {

    /***
     * @AutoWired注解的方法或者属性都会触发getBean操作
     *
     * @param cq
     * @param hb
     */
//    @Autowired
    public AutowiredConstructBean(CQ cq, HB hb) {
        System.out.println("cq = " + cq);
        System.out.println("hb = " + hb);
    }
}
