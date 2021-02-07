package com.itszt.gold;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HB {
    public HB() {
        System.out.println("HB初始化完成！！！");
    }
}
