package com.itszt.gold.factorymethod.autowired;


import com.itszt.gold.CQ;
import com.itszt.gold.HB;
import lombok.Data;
import org.springframework.stereotype.Component;

/***
 *  实例化无参构造
 */
@Data
//@Component
public class NoConstructBean {
    /**
     * 实例化无参构造,
     * 默认指定无参构造函数
     */
    public NoConstructBean() {
    }


    public NoConstructBean(CQ cq, HB hb) {
        System.out.println("cq = " + cq);
        System.out.println("hb = " + hb);
    }


    public NoConstructBean(CQ cq) {
        System.out.println("cq = " + cq);
    }

}
