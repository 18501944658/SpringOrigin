package com.itszt.gold;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CQ {

    public CQ() {
        System.out.println("CQ初始化完成！！！");
    }
}
