package com.itszt.gold.bean20210114;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Mans {

    public void getName(){
        System.out.println("执行Mans的getName方法完成！！！！");
    }
}
