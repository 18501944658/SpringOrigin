package com.itszt.gold.importBean;


import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import({ImportGoldBean.class,DeferredImportSelectorDemo.class})
public class ImportBean {
}
