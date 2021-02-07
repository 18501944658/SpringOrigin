package com.itszt.gold.factorymethod.autowired;


import com.itszt.gold.CQ;
import com.itszt.gold.HB;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Data
@Component
public class AutowiredBean  {


    @Autowired
    private CQ cq;

    @Autowired
    private HB hb;

    public AutowiredBean() {
    }
}
