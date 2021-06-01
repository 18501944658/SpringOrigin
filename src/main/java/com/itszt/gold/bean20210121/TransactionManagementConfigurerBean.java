package com.itszt.gold.bean20210121;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

@Component
public class TransactionManagementConfigurerBean implements TransactionManagementConfigurer {

    @Autowired
    private DataSource dataSource;

    public TransactionManager annotationDrivenTransactionManager() {

        return null;
    }
}
