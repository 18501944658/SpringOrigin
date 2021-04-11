package com.itszt.gold.cycle.multiCycle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 多例循环依赖
 */
@Component
@Data
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CycleBeanBBBProperty {


    @Autowired
    private CycleBeanAAAProperty cycleBeanAAAProperty;
}
